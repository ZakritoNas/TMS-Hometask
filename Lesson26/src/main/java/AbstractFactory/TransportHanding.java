package AbstractFactory;

import AbstractFactory.domain.Transport;
import AbstractFactory.factory.TransportAbstractFactory;

public class TransportHanding {

    public void doHanding (Transport transport, TransportAbstractFactory factory){
        System.out.println("Mark: " + transport.getMark() + " color: " + transport.getColor());

        factory.washService().doWash();

        factory.repairService().diagnostics(transport);
    }
}
