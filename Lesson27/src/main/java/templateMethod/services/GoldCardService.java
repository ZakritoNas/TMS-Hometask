package templateMethod.services;

import templateMethod.domain.*;

public class GoldCardService extends CardService {

    @Override
    public Card prepare(Employee employee, Card card) {

        if (employee.getPosition().equals(Position.SUPERVISOR)) {
            card.setType("Gold");

            Subscription subscription1 = new Subscription(TypeOfSubscription.SPA, 1);
            Subscription subscription2 = new Subscription(TypeOfSubscription.GUM, 1);
            Subscription subscription3 = new Subscription(TypeOfSubscription.POOL, 1);
            System.out.println("You get all types of subscriptions: " + subscription1.getSubscription() + ", " + subscription2.getSubscription() + ", " + subscription3.getSubscription());

            return card;
        } else {
            System.out.println("Invalid service selected, check the details provided");
            throw new RuntimeException();
        }
    }
}
