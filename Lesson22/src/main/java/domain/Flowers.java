package domain;
import lombok.*;

import java.util.UUID;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Flowers {
    private UUID id;
    private String name;
    private String color;
}
