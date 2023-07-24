public class Main {
    public static void main(String[] args) {

        Worker worker1 = new Worker("Петр ","Касилович",10);
        Worker worker2 = new Worker("Виктория ","Дайнеко",15);
        Worker worker3 = new Worker("Елизавета ","Янковская",6);
        Director director1 = new Director("Павел ", "Стрик", 7);
        Director director2 = new Director("Александра ", "Филонова", 6);

        System.out.println(worker1.toString());
        System.out.println(worker2.toString());
        System.out.println(worker3.toString());
        System.out.println(director1.toString());
        System.out.println(director2.toString());

        director1.addSubord(worker1, worker2);
        director1.addSubord(director2);
        director2.addSubord(worker3);

        System.out.println("Подчиненность сотрудников:");
        Service.infEmployee(director1);

        System.out.println(Service.findEmployee(director1, "Александра "));
    }
}
