import java.util.Scanner;

public class Lesson3Cycle3 {
        public static void main(String[] args) {
            Scanner userInput = new Scanner(System.in);
            int userValue = userInput.nextInt();
            int n = 0;
            for (int i = 1; i <= userValue ; i++) { /* если применительно к этой ситуации необходимо высчитать
        сумму чисел включительно введенную нами, то в условии используем оператор "<=", если же не включительно, то "="
        */
                n += i;
            }
            System.out.println(n);
        }
}
