package decorator.services;

import decorator.domain.Document;
import decorator.domain.Subject;

public class SalesDepartmentImpl implements Decorator{

    private Decorator decorator;

    public SalesDepartmentImpl(Decorator decorator) {
        this.decorator = decorator;
    }

    @Override
    public Document sign() {
        Document document = decorator.sign();
        if (!document.getSubject().equals(Subject.GOODS)){
            System.out.println("SalesDepartment: Forward to the Services department");
        } else {
            System.out.println("SalesDepartment: The subject of the contract compiles with the standards");
            System.out.println("Signed by Sales department");
        }
        return document;
    }
}
