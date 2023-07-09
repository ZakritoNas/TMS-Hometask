import java.util.Arrays;
import java.util.Scanner;

public class Lesson4Array1 {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 2, 2, 4, 5, 6};
        Scanner userInput = new Scanner(System.in);
        int userValue = userInput.nextInt();
        int size = 0;
        boolean z = false;
        for (int el : arr) {
            if (el == userValue) {
                z = true;
                break;
            }
        }
        if (z) {
            for (int el : arr) {
                if (el == userValue) {
                    size++;
                }
            }
            int n = arr.length - size;
            int[] second = new int[n];
            int h = 0;
            for (int i : arr) {
                if (i != userValue)
                    second[h++] = i;
            }
            System.out.println(Arrays.toString(second));
        } else {
            System.out.println("Введенное число не входит в массив");
        }
    }
}
