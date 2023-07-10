import java.util.Scanner;

public class Lesson4Array0 {
        public static void main(String[] args) {

            int[] arr = new int[]{5, 5, 15, 20, 25};
            Scanner userInput = new Scanner(System.in);
            int userValue = userInput.nextInt();
            boolean n = false;
            for (int el : arr) {
                if (el == userValue) {
                    n = true;
                    break;
                }
            }
            if (n) {
                System.out.println("Введенное число входит в массив");
            } else {
                System.out.println("Введенное число не входит в массив");
            }
        }
}
