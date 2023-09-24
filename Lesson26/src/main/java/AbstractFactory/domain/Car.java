package AbstractFactory.domain;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Car extends Transport{
    private String mark;
    private String color;
    private boolean diagnostic;
}
