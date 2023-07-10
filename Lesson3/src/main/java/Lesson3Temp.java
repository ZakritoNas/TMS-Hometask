public class Lesson3Temp {
    public static void main(String[] args) {
        int t = -16;
        if (t > -5) {
            System.out.println("Тепло");
        } else if (-5 >= t && t > -20) {
            System.out.println("Нормально");
        } else if (-20 >= t) {
            System.out.println("Холодно");
        }
    }
}
