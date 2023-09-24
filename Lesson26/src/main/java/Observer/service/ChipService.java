package Observer.service;

import Observer.domain.Chip;
import Observer.domain.Employee;

public class ChipService {
    public Chip createPublicChip (Employee employee){
        Chip chip = new Chip();
        chip.setType("Public access");
        return chip;
    }

    public Chip createSpecialChip (Employee employee){
        Chip chip = new Chip();
        chip.setType("Special access");
        return chip;
    }

}
