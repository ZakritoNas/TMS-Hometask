package templateMethod;

import templateMethod.domain.Employee;
import templateMethod.domain.Position;
import templateMethod.services.ClassicCardService;
import templateMethod.services.Creator;

public class MainApp {
    public static void main(String[] args) {
        Employee employee = new Employee("Dima", Position.WORKER, 4);
        Creator creator = new Creator();
        creator.creator(employee, new ClassicCardService());
    }
}
