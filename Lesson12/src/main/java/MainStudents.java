import java.util.ArrayList;
import java.util.List;

public class MainStudents {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("Nastya", "Sveta", "Iliya", "arina", "Oleg",
                "Angelika", "Denis", "Vlad", "Alexey", "Maxim", "Yana"));

        long count = list.stream()
                .filter(name -> name.equalsIgnoreCase("Nastya"))
                .count();
        System.out.println("Количество людей с моим именем: " + count);
        System.out.println("имена начинающиеся на букву А :");

        list.stream()
                .filter(name -> name.startsWith("A") || name.startsWith("a"))
                .forEach(System.out::println);

        String sort = list.stream()
                .sorted()
                .findFirst()
                .orElse("Empty@");
        System.out.println("Первый элемент коллекции: " + sort);
    }
}
