package decorator.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Document {
    private int amount;
    private boolean legality;
    private Subject subject;
}
