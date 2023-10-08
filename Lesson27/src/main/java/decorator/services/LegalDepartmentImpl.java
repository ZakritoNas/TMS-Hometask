package decorator.services;

import decorator.domain.Document;
import decorator.domain.Subject;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class LegalDepartmentImpl implements Decorator{

    private Decorator decorator;

    public LegalDepartmentImpl(Decorator decorator) {
        this.decorator = decorator;
    }

    @Override
    public Document sign() {
        Document document = new Document();
        document.setAmount(2000000);
        document.setSubject(Subject.SERVICES);
        document.setLegality(true);

        System.out.println("Signed by Legal department");
        return document;
    }
}
