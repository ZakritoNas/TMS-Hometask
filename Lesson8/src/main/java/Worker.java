public class Worker extends Employee {

    public Worker(String name, String surname, int experience) {
        super(name, surname, experience);
        this.position = Employ.WORKER;
    }

    @Override
    public String toString () {
        return "Работник: " + name + " " + surname + "," + " з/п: " + wages() + ";";
    }
}
