package org.example.service;
import org.example.domain.Contract;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ContractServiceImpl implements ContractService{
    List<Contract> contracts = new ArrayList<>();

    @Override
    public List<Contract> getContract() {
        return contracts;
    }
    @Override
    public void save(Contract contract) {
        contracts.add(contract);
        System.out.println("add contract");
    }
}
