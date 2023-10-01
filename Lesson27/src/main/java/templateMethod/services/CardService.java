package templateMethod.services;

import templateMethod.domain.Card;
import templateMethod.domain.Employee;

public abstract class CardService {

    public void creator(Employee employee){
        try {
            System.out.println("We prepare your card...");
            Card card = new Card();
            card.setName(employee.getName());
            prepare(employee, card);
            System.out.println("Your card has been successfully created, type of your card: " + card.getType());
        }
        catch (RuntimeException r){
            System.out.println("Your card cannot be created");
        }
    }

    public abstract Card prepare(Employee employee, Card card);

}
