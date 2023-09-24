public class SingletonMain {

    public static void main(String[] args) throws InterruptedException {

            MyThread mythread1 = new MyThread("1");
            MyThread mythread2 = new MyThread("2");
            MyThread mythread3 = new MyThread("3");

            mythread1.start();
            mythread2.start();
            mythread3.start();

            mythread1.join();
            mythread2.join();
            mythread3.join();

    }
}
