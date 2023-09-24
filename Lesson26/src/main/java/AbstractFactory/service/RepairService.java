package AbstractFactory.service;

import AbstractFactory.domain.Transport;

public interface RepairService {
    public Transport diagnostics (Transport transport);
}
