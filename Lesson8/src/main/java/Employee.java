public abstract class Employee {
    public String name;
    public String surname;
    public int experience;
    public Employ position;

    public Employee (String name, String surname, int experience) {
        this.name = name;
        this.surname = surname;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public Employ getPosition() {
        return position;
    }

    public int wages () {
        int wage = 1000 * position.getCoefficient() * experience;
        return wage;
    }
}
