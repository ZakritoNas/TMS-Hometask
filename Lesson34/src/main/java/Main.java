import entity.PersonEntity;
import entity.PhoneEntity;
import enums.Operator;
import service.PersonService;

import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        PersonService service = new PersonService();

        var phone1 = PhoneEntity.builder()
                .number(295684216)
                .date(new Date())
                .active(true)
                .operator(Operator.A1)
                .build();

        var phoneSaved1 = service.save(phone1);

        var phone2 = PhoneEntity.builder()
                .number(335267841)
                .date(new Date())
                .active(true)
                .operator(Operator.MTS)
                .build();

        var phoneSaved2 = service.save(phone2);

        var person = PersonEntity.builder()
                .name("Nastya")
                .address("Minsk, st. Rafieva-54, apt. 234")
                .phone(List.of(phone1, phone2))
                .build();

        var personSaved = service.save(person);

        PersonEntity byId = service.getByID(personSaved);
    }
}
