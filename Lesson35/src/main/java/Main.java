import entity.PersonEntity;
import entity.TaskEntity;
import enums.PersonType;
import enums.TaskStatus;
import service.PersonService;
import service.TaskService;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        TaskService taskService = new TaskService();
        PersonService personService = new PersonService();

        var user1 = PersonEntity.builder()
                .name("Dima")
                .type(PersonType.USER)
                .birthday(LocalDate.of(1992, 5, 24))
                .isMan(true)
                .build();

        var user2 = PersonEntity.builder()
                .name("Masha")
                .type(PersonType.ADMIN)
                .birthday(LocalDate.of(2000, 7, 15))
                .isMan(false)
                .build();

        var task1 = TaskEntity.builder()
                .title("Activity check")
                .description("Add the ability to check user activity")
                .status(TaskStatus.DONE)
                .build();

        var task2 = TaskEntity.builder()
                .title("Adding Features")
                .description("Add the ability to save user cart data")
                .status(TaskStatus.IN_PROGRESS)
                .build();

        var task3 = TaskEntity.builder()
                .title("Password update")
                .description("Please update your password")
                .status(TaskStatus.NEW)
                .build();

        var task4 = TaskEntity.builder()
                .title("Confirm actions on your profile")
                .description("We have detected suspicious activity on your profile, please confirm that it was you")
                .status(TaskStatus.DONE)
                .build();

        var task5 = TaskEntity.builder()
                .title("Check for updates")
                .description("Check system updates")
                .status(TaskStatus.IN_PROGRESS)
                .build();


        user1.addTask(task1);
        user1.addTask(task2);
        user1.addTask(task4);
        user2.addTask(task3);
        user2.addTask(task5);

        System.out.println("Проверяем сохранение");
        personService.save(user1);
        personService.save(user2);
        personService.getAll();


        System.out.println("Обновляем статусы задач");
        taskService.updateStatus(task2, TaskStatus.DONE);
        taskService.updateStatus(task3, TaskStatus.IN_PROGRESS);

        System.out.println("Получаем пользователей с активными задачами");
        personService.getByActiveTask();

        System.out.println("Удаляем пользователей");
        personService.delete(user1);
        personService.delete(user2);
        personService.getAll();

    }
}
