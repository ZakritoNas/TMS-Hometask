package AbstractFactory.factory;

import AbstractFactory.service.CarRepairService;
import AbstractFactory.service.CarWashService;
import AbstractFactory.service.RepairService;
import AbstractFactory.service.WashService;

public class CarAbstractFactory implements TransportAbstractFactory{
    @Override
    public WashService washService() {
        return new CarWashService();
    }
    @Override
    public RepairService repairService() {
        return new CarRepairService();
    }
}
