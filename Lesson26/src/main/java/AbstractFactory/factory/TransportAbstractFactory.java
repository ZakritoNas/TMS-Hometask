package AbstractFactory.factory;

import AbstractFactory.service.RepairService;
import AbstractFactory.service.WashService;

public interface TransportAbstractFactory {
    WashService washService();
    RepairService repairService();

}
