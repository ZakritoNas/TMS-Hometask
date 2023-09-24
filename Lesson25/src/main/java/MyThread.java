public class MyThread  extends Thread{
    private String name;

    public MyThread (String name){
        this.name = name;
    }

    public void run(){
        Singleton.getInstance().counter(name);
    }
}

