import dto.PersonSearchDto;
import dto.TaskSearchDto;
import entity.PersonEntity;
import entity.TaskEntity;
import enums.PersonType;
import enums.TaskStatus;
import service.PersonSearchService;
import service.PersonService;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        PersonService personService = new PersonService();
        PersonSearchService searchService = new PersonSearchService();

        var person1 = PersonEntity.builder()
                .name("Dima")
                .type(PersonType.USER)
                .birthday(LocalDate.of(1992, 5, 24))
                .isMan(true)
                .build();

        var person2 = PersonEntity.builder()
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
                .status(TaskStatus.NEW)
                .build();

        var task5 = TaskEntity.builder()
                .title("Check for updates")
                .description("Check system updates")
                .status(TaskStatus.IN_PROGRESS)
                .build();


        person1.addTask(task1);
        person1.addTask(task2);
        person1.addTask(task5);
        person2.addTask(task3);
        person2.addTask(task4);

        personService.save(person1);
        personService.save(person2);

        var personSearch = PersonSearchDto.builder()
                .name("Dima")
                .type(PersonType.ADMIN)
                .birthdayFrom(LocalDate.of(1990, 1, 1))
                .birthdayTo(LocalDate.of(1999, 1, 1))
                .build();

        var taskSearch = TaskSearchDto.builder()
                .status(TaskStatus.DONE)
                .build();

        System.out.println("Осуществляем поиск");
        System.out.println(searchService.searchPerson(personSearch));
        System.out.println("Осуществляем поиск по статусу задач");
        System.out.println(searchService.searchPersonByTask(taskSearch));

    }
}
