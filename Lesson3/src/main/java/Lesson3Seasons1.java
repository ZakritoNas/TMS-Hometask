public class Lesson3Seasons1 {
    public static void main(String[] args) {
        int value = 5;
        switch (value) {
            /* можно прописывать sout после каждого case, но в этом нет необходимости,
            т.к. при определенных значениях переменной value будут выполняться одинаковые действия
            (выводиться одна и та же пора года)
             */
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;

        }

    }
}
