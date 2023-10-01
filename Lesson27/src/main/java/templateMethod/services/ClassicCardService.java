package templateMethod.services;
import templateMethod.domain.*;

public class ClassicCardService extends CardService {

    @Override
    public Card prepare(Employee employee, Card card) {
        if (employee.getPosition().equals(Position.WORKER)) {
            card.setType("Classic");

            if (employee.getExperience() <= 3) {
                Subscription subscription = new Subscription(TypeOfSubscription.POOL, 1);
                System.out.println("You can get a subscription to visit the: " + subscription.getSubscription());
            } else if (employee.getExperience() > 3 && employee.getExperience() <= 5) {
                Subscription subscription1 = new Subscription(TypeOfSubscription.POOL, 1);
                Subscription subscription2 = new Subscription(TypeOfSubscription.GUM, 1);
                System.out.println("You can get a subscriptions to visit the: " + subscription1.getSubscription() + ", " + subscription2.getSubscription());
            } else if (employee.getExperience() > 5) {
                Subscription subscription1 = new Subscription(TypeOfSubscription.SPA, 1);
                Subscription subscription2 = new Subscription(TypeOfSubscription.GUM, 1);
                Subscription subscription3 = new Subscription(TypeOfSubscription.POOL, 1);
                System.out.println("You get all types of subscriptions: " + subscription1.getSubscription() + ", " + subscription2.getSubscription() + ", " + subscription3.getSubscription());
            }

            return card;
        } else {
            System.out.println("Invalid service selected, check the details provided");
            throw new RuntimeException();
        }
    }
}
