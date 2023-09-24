package AbstractFactory;

import AbstractFactory.domain.Transport;
import AbstractFactory.factory.CarAbstractFactory;
import AbstractFactory.factory.MotorcycleAbstractFactory;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        Transport transport1 = new Transport("KAWASAKI", "black", false);
        Transport transport2 = new Transport("BMW", "black", false);

        TransportHanding transportHanding = new TransportHanding();

        transportHanding.doHanding(transport1, new MotorcycleAbstractFactory());
        transportHanding.doHanding(transport2, new CarAbstractFactory());

    }

}
