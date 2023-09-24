public class Singleton {

    private static Singleton instance;
    private int count = 0;

    private Singleton(){}

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public synchronized void counter (String name){
        for (int i = 0; i < 1_000_000; i++ ){
            count = count + 1;
        }
        System.out.println(name + " " + count);
    }

    public int getCount() {
        return count;
    }
}