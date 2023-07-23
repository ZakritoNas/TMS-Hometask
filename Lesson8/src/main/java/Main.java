public class Main {
    public static void main(String[] args) {

        Worker worker1 = new Worker("Петр ","Касилович",10,Employ.WORKER);
        Worker worker2 = new Worker("Виктория ","Дайнеко",15,Employ.WORKER);
        Worker worker3 = new Worker("Елизавета ","Янковская",6,Employ.WORKER);
        Director director1 = new Director("Павел ", "Стрик", 7, Employ.DIRECTOR);
        Director director2 = new Director("Александра ", "Филонова", 6, Employ.DIRECTOR);

        System.out.println(worker1);
        System.out.println("З/п: " + worker1.wages());

        System.out.println(worker2);
        System.out.println("З/п: " + worker2.wages());

        System.out.println(worker3);
        System.out.println("З/п: " + worker3.wages());

        System.out.println(director1);
        System.out.println("З/п: " + director1.wages());

        director1.addSubord(worker1);
        director1.addSubord(worker2);
        director2.addSubord(worker3);
        director1.addSubord(director2);
    }
}
