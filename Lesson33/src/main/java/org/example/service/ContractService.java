package org.example.service;

import org.example.domain.Contract;

import java.util.List;

public interface ContractService {
     List<Contract> getContract();
     void save (Contract contract);
}
