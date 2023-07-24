import java.util.Arrays;

public class Director extends Employee{
    Employee [] subord = new Employee[7];

    public Director (String name, String surname, int experience) {
        super(name, surname, experience);
        this.position = Employ.DIRECTOR;
    }

    public void addSubord (Employee ... employee) {
        for (Employee empl : employee) {
            for (int i = 0; i < subord.length; i++) {
                if (subord[i] == null) {
                    subord[i] = empl;
                    break;
                }
            }
        }
    }

    private int countSubord (){
        int count = 0;
        for (Employee empl : subord){
            if (empl != null){
                count++;
            } else break;
        }
        return count;
    }

    public int wagesDir (){
        int quantityEmployees = countSubord();
        if (quantityEmployees > 1) {
            return wages() * countSubord();
        } else return wages();
    }

    public Employee[] getSubordArray (){ // можно ли так делать?
        return subord;
    }

    @Override
    public String toString () {
        return "Директор: " + name + surname + "," + " з/п: " + wagesDir() + ";";
    }
}
