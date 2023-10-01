package templateMethod.services;

import templateMethod.domain.Employee;

public class Creator {
    public void creator(Employee employee, CardService cardService){
        cardService.creator(employee);
    }
}
