package decorator.services;

import decorator.domain.Document;

public class FinancialDepartmentImpl implements Decorator{

    private Decorator decorator;

    public FinancialDepartmentImpl(Decorator decorator) {
        this.decorator = decorator;
    }

    @Override
    public Document sign() {
        Document document = decorator.sign();
        if (document.getAmount() == 0) {
            System.out.println("FinancialDepartment: For revision");
        } else {
            System.out.println("Signed by Financial department");
        }
        return document;
    }
}
