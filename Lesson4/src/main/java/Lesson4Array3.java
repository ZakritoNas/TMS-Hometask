import java.util.Arrays;

public class Lesson4Array3 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int[] sc = new int[]{6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(sc));
        int sum1 = 0;
        for (int i = 0; i < arr.length; i += 1) {
            sum1 += arr[i];
        }
        double j = sum1 / arr.length;
        System.out.println(j);
        int sum2 = 0;
        for (int i = 0; i < sc.length; i += 1) {
            sum2 += sc[i];
        }
        double s = sum2 / sc.length;
        System.out.println(s);
        if (j == s) {
            System.out.println("Средние арифметические массивов равны");
        } else if (j > s) {
            System.out.println("Среднее арифметическое массива arr больше среднего арифметического массива sc");
        } else if (s > j) {
            System.out.println("Среднее арифметическое массива sc больше среднего арифметического массива arr");
        }
    }
}
