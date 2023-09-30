package Iterator.config;


import Iterator.domain.SportCar;

import java.util.ArrayList;
import java.util.List;

public class SportCarIterator implements Iterator{

    private int position = 0;
    private List<SportCar> sportCars = new ArrayList<>();

    public SportCarIterator(List<SportCar> sportCars) {
        this.sportCars = sportCars;
    }

    @Override
    public boolean hasNext() {
        return position < sportCars.size();
    }

    @Override
    public SportCar getNext() {
        if (!hasNext()) {
            throw new RuntimeException();
        }
        SportCar sportCar = sportCars.get(position);
        position++;
        return sportCar;
    }
}
