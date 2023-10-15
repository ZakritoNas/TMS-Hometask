package org.example.service;

import org.example.domain.Contract;
import org.example.exeptions.ContractNameException;
import org.example.exeptions.ContractNumberException;
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

        if (contract.getNumber() == null){
            throw new ContractNumberException(contract);
        }
        if(contract.getName() == null || contract.getName().isBlank()){
            throw new ContractNameException(contract);
        }
        contracts.add(contract);
        System.out.println("Add new contract");
    }
}
