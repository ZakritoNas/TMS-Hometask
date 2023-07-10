import java.util.Arrays;

public class Lesson4Array2 {
    public static void main(String[] args) {
        // размер массива устанавливается сразу
        int n = 5;
        double[] randoms = new double [n];
        for (int i = 0; i < n; i++){
            randoms [i] = Math.random();
        }
        System.out.println(Arrays.toString(randoms));
        double max = randoms[0];
        double min = randoms[0];
        double sr = 0;
        // вычисление максимального
        for (int i = 1; i < randoms.length; i++) {
            if (randoms[i] > max) {
                max = randoms[i];
            }
            // вычисление минимального
            if (randoms[i] < min) {
                min = randoms[i];
            }
            // вычисление среднего
            sr += randoms[i]/randoms.length;
        }
        System.out.println("Максимальное -" + max);
        System.out.println("Минимальное -" + min);
        System.out.println("Среднее -" + sr);


        /* Размер массива вводится с консоли
        Scanner userInput = new Scanner(System.in);
        int userValue = userInput.nextInt();
        double[] randoms = new double [userValue];
        for (int i = 0; i < userValue; i++){
            randoms [i] = Math.random();
        }
        System.out.println(Arrays.toString(randoms));
         */
    }
}
