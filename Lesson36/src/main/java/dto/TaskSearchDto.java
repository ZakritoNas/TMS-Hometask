package dto;

import entity.PersonEntity;
import enums.TaskStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TaskSearchDto {
    private String title;
    private String description;
    private TaskStatus status;
    private PersonEntity person;
}
