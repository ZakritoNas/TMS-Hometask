package org.example.exeptions;
import lombok.Data;
import org.example.domain.Contract;

@Data
public class ContractNumberException extends RuntimeException{
    private Contract contract;
    public ContractNumberException(Contract contract) {
        this.contract = contract;
    }
}
