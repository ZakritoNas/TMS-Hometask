package Observer.service;

import Observer.domain.Card;
import Observer.domain.Employee;

public class CardService {

    public Card createGoldCard (Employee employee){
        Card card = new Card ();
        card.setName(employee.getName());
        card.setType("Gold");
        return card;
    }

    public Card createClassicCard (Employee employee){
        Card card = new Card ();
        card.setName(employee.getName());
        card.setType("Classic");
        return card;
    }


}
