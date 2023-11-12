package dto;

import entity.TaskEntity;
import enums.PersonType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PersonSearchDto {

    private Integer id;
    private String name;
    private PersonType type;
    private LocalDate birthdayFrom;
    private LocalDate birthdayTo;
    private Boolean isMan;

}
