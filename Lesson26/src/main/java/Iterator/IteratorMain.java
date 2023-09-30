package Iterator;

import Iterator.config.SportCarIterator;
import Iterator.domain.SportCar;

import java.util.List;

public class IteratorMain {

    public static void main(String[] args) {

        List<SportCar> list = List.of(
                new SportCar("Lamborghini", "blue"),
                new SportCar("Porsche", "black"),
                new SportCar("Bentley", "red"),
                new SportCar("Chevrolet", "grey"),
                new SportCar("Ferrari", "red")
        );

        SportCarIterator iterator = new SportCarIterator(list);
        while (iterator.hasNext()){
            System.out.println(iterator.getNext());
        }
    }

}
