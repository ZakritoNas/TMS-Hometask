public class Counter {
    private int count = 0;

    public synchronized void counter (String name){
        for (int i = 0; i < 1000_000; i++ ){
            count = count + 2;
        }
        System.out.println(name + " " + count);
    }

    public int getCount() {
        return count;
    }
}
