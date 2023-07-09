public class Lesson3Cycle2 {
    public static void main(String[] args) {
        for (int n = 5; n > 0; n--){
            System.out.println(n);
        }

        // на мой взгляд, в данной ситуации, самый удобный цикл for
         /* Можно через while
        int n = 6;
        while (n > 1) {
            --n;
            System.out.println(n);
        }
        */

        /* Можно также через do-while
        int n = 6;
        do {
            --n;
            System.out.println(n);
        }
            while (n > 1);
            */
    }
}
