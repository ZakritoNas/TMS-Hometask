package org.example.web;

import org.example.exeptions.ContractNameException;
import org.example.exeptions.ContractNumberException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ErrorController {
    @ExceptionHandler(ContractNumberException.class)
    public String nameError(ContractNumberException numberException){
        System.out.println("ERROR: " + numberException.getContract().getNumber() + " invalid number");
        return "error";
    }

    @ExceptionHandler(ContractNameException.class)
    public String typeError(ContractNameException nameException){
        System.out.println("ERROR: " + nameException.getContract().getName() + " invalid name");
        return "error";
    }
}
