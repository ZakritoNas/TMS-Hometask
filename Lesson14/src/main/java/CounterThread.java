public class CounterThread implements Runnable {

    private Counter counter;
    private String name;

    public CounterThread(Counter counter, String name) {
        this.counter = counter;
        this.name=name;
    }

    @Override
    public void run(){
        counter.counter(name);
    }
}
