package org.example.exeptions;
import lombok.Data;
import org.example.domain.Contract;
@Data
public class ContractNameException extends RuntimeException{
    private Contract contract;
    public ContractNameException(Contract contract) {
        this.contract = contract;
    }
}
