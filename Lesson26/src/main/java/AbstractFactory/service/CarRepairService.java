package AbstractFactory.service;

import AbstractFactory.domain.Transport;

public class CarRepairService implements RepairService {

    public Transport diagnostics (Transport transport){
        if (!transport.isDiagnostic()){
            System.out.println("We have diagnosed your car");
            transport.setDiagnostic(true);
        }
        return transport;
    }
}
