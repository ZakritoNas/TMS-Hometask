public abstract class Employee {
    private String name;
    private String surname;
    public int experience;
    private Employ position;



    public Employee (String name, String surname, int experience, Employ position) {
        this.name = name;
        this.surname = surname;
        this.experience = experience;
        this.position = position;
    }

    public int wages () {
        int wage = 1000 * position.getCoefficient() * experience;
        return wage;
    }

    public String toString (){
        return name + surname;
    }

    public String getName() {
        return name;
    }
}
