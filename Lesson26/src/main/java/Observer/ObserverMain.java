package Observer;

import Observer.domain.Employee;
import Observer.service.AccountingService;
import Observer.service.AdministratorService;

public class ObserverMain {
    public static void main(String[] args) {
        Employee employee = new Employee("Dima", Position.WORKER);
        Employee employee1 = new Employee("Dasha", Position.SUPERVISOR);

        AdministratorService administratorService = new AdministratorService();
        AccountingService accountingService = new AccountingService();


        employee.addObserver(accountingService);
        employee.addObserver(administratorService);

        employee1.addObserver(accountingService);
        employee.create();
        System.out.println("-------------------------------");
        employee1.create();

    }
}
