public class MainApp {
    public static void main(String[] args) throws InterruptedException {

    Counter counter = new Counter();

    Thread thread1 = new Thread(new CounterThread(counter, "first:"));
    Thread thread2 = new Thread(new CounterThread(counter, "second:"));
    Thread thread3 = new Thread(new CounterThread(counter, "third:"));

        thread3.start();
        thread3.join();

        thread2.start();
        thread2.join();

        thread1.start();
        thread1.join();

        System.out.println("Finish: " + counter.getCount());

    }
}
