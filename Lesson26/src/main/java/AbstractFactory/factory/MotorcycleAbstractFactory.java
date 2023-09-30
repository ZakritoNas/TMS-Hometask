package AbstractFactory.factory;

import AbstractFactory.service.MotorcycleRepairService;
import AbstractFactory.service.MotorcycleWashService;
import AbstractFactory.service.RepairService;
import AbstractFactory.service.WashService;

public class MotorcycleAbstractFactory implements TransportAbstractFactory{
    @Override
    public WashService washService() {
        return new MotorcycleWashService();
    }

    @Override
    public RepairService repairService() {
        return new MotorcycleRepairService();
    }
}
