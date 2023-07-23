public class Director extends Employee{


    public Director (String name, String surname, int experience, Employ position) {
        super(name, surname, experience, position);
    }
    @Override
    public int wages () {
        return 1000 * Employ.DIRECTOR.getCoefficient() * experience;
    }

    Employee [] subord = new Employee[5];
    public Employee[] addSubord (Employee employee) {
        for (int i = 0; i < subord.length; i++){
            if (subord[i] == null) {
                subord[i] = employee;
                break;
            }
        }
        return subord;
    }
}
