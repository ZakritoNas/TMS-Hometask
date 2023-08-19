import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MyCalendar {
    public static void main(String[] args) {

        Calendar now = Calendar.getInstance();
        int nowDay = now.get(Calendar.DAY_OF_WEEK);
        int dayOfWeek = 3; // порядковый номер вторника
        // Чтобы не прописывать сколько дней надо добавлять к каждому дню недели
        // Берем одну отправную точку (суббота т.к. начало недели с воскресенья) и от неё считаем
        int days = (Calendar.SATURDAY - nowDay + dayOfWeek); //находим количество дней к добавлению
        now.add(Calendar.DAY_OF_MONTH, days);

        Date date = now.getTime();
        String format = new SimpleDateFormat("dd.MM.YYYY").format(date);
        System.out.println("Следующий вторник: " + format);

    }
}
