package Observer.service;

import Observer.domain.Employee;
import Observer.Position;
import java.util.Observable;
import java.util.Observer;

public class AdministratorService implements Observer {

    @Override
    public void update(Observable o, Object arg){
        if (arg instanceof Employee){
            var employee = (Employee) arg;
            System.out.println("Connect a computer for " + employee.getName());
            System.out.println("Create chip for " + employee.getName());
            ChipService chipService = new ChipService();
            if (employee.getPosition().equals(Position.SUPERVISOR)){
                System.out.println(chipService.createSpecialChip(employee));
            } else {
                System.out.println(chipService.createPublicChip(employee));
            }
        }

    }

}
