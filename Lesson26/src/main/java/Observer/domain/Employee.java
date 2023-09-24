package Observer.domain;

import Observer.Position;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Observable;
@Setter
@Getter
@ToString
public class Employee extends Observable {

    private String name;
    private Position position;

    public Employee(String name, Position position) {
        this.name = name;
        this.position = position;
    }

    public void create() {
        setChanged();
        notifyObservers(this);
    }
}
