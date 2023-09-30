package Observer.service;

import Observer.domain.Employee;
import Observer.Position;
import java.util.Observable;
import java.util.Observer;

public class AccountingService implements Observer {

    @Override
    public void update(Observable o, Object arg){
        if (arg instanceof Employee){
            var employee = (Employee) arg;
            System.out.println("Create card for " + employee.getName());
            CardService cardService = new CardService();
            if (employee.getPosition().equals(Position.SUPERVISOR)){
                System.out.println(cardService.createGoldCard(employee));
            } else {
                System.out.println(cardService.createClassicCard(employee));

            }
        }

    }

}
