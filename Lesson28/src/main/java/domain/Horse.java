package domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Horse {
    private String name;
    private double speed = 0;

    public Horse(String name) {
        this.name = name;
    }
}
