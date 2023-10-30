package entity;

import enums.PersonType;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "users")
public class PersonEntity {

    @Id
    @GeneratedValue(generator = "uuid_generator")
    @GenericGenerator(name = "uuid_generator", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID id;
    private String name;
    @Enumerated(EnumType.STRING)
    private PersonType type;
    private LocalDate birthday;
    private boolean isMan;

    @OneToMany(mappedBy = "user",
    cascade = CascadeType.ALL,
    fetch = FetchType.EAGER)
    private List<TaskEntity> task;

    public void addTask (TaskEntity taskEntity){
        if(task == null){
            task = new ArrayList<>();
        }
        task.add(taskEntity);
        taskEntity.setUser(this);
    }
}
