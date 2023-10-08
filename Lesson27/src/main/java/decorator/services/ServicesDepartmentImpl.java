package decorator.services;

import decorator.domain.Document;
import decorator.domain.Subject;

public class ServicesDepartmentImpl implements Decorator{
    private Decorator decorator;

    public ServicesDepartmentImpl(Decorator decorator) {
        this.decorator = decorator;
    }

    @Override
    public Document sign() {
        Document document = decorator.sign();
        if (!document.getSubject().equals(Subject.SERVICES)){
            System.out.println("ServicesDepartment: Forward to the Sales department");
        } else {
            System.out.println("ServicesDepartment: The subject of the contract compiles with the standards");
            System.out.println("Signed by Services department");
        }
        return document;
    }
}
