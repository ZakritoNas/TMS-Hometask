import java.util.ArrayList;
import java.util.List;

public class MainNumbers {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(List.of(5, 7, 8, 9, 6, 11, 20, 17, 5, 8, 20));

        // Для заполнения рандомными элементами
        /*   int element = 20;
        for (int i = 0; i < element; i++) {
         int a = (int) (Math.random() * 20 + 1);
            list.add(a);
        }*/
        System.out.println("Без дубликатов");
        list.stream()
                .distinct()
                .forEach(System.out::println);

        System.out.println("Четные в диапазоне от 7 до 17");
        list.stream()
                .filter (integer -> integer <= 17 && integer >= 7)
                .filter(integer -> integer % 2 == 0)
                .forEach(System.out::println);

        System.out.println("Умноженные на 2");
        list.stream()
                .map(integer -> integer * 2)
                .forEach(System.out::println);

        System.out.println("Сортировка");
        list.stream()
                .sorted()
                .limit(4)
                .forEach(System.out::println);

        long count = list.stream()
                .count();
        System.out.println("Количество элементов в стриме: " + count);

        double average = list.stream()
                .mapToInt(Integer::intValue)
                .average().orElse(0);
        System.out.println("Среднее арифметическое: " + average);

    }
}
