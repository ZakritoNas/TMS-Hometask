package entity;

import enums.Operator;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "phones")
public class PhoneEntity {

    //вылетает ошибка ClassCastException. Почитала про нее, но не могу понять конкретно причину в данном случае
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer number;
    @Temporal(TemporalType.DATE)
    private Date date;
    private Boolean active;
    @Enumerated(EnumType.STRING)
    private Operator operator;

    @ManyToOne
    private PersonEntity person;
}
