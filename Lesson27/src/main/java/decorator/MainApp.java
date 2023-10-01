package decorator;

import decorator.services.*;

public class MainApp {
    public static void main(String[] args) {
        Decorator decorator = new FinancialDepartmentImpl(new ServicesDepartmentImpl(new SalesDepartmentImpl(new LegalDepartmentImpl())));
        decorator.sign();
    }
}
