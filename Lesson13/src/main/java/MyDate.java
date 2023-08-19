import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class MyDate {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Введите дату формата: YYYY-MM-dd");
        String userData = userInput.nextLine();

        try {
            LocalDate data = LocalDate.parse(userData);
            System.out.println(data.getDayOfWeek());
        }
        catch (DateTimeParseException e) {
            System.out.println("Неверный формат даты");
        }
    }
}

