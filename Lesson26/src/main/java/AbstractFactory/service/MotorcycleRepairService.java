package AbstractFactory.service;

import AbstractFactory.domain.Transport;

public class MotorcycleRepairService implements RepairService{

    @Override
    public Transport diagnostics (Transport transport){
        if (!transport.isDiagnostic()){
            System.out.println("We have diagnosed your motorcycle");
            transport.setDiagnostic(true);
            return transport;
        }
        return transport;
    }
}
