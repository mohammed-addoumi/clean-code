package models;

import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Setter
@Getter
@Builder
@AllArgsConstructor
@ToString
public class Inventory {
    private List<Guitar> guitars;

    public Inventory(){
        guitars = new ArrayList<>();
    }

    public void addGuitar(Guitar guitar){
        this.guitars.add(guitar);
    }

    public Guitar getGuitar(String serialNumber){
        return guitars.stream()
                        .filter(guitar -> guitar.getSerialNumber().equalsIgnoreCase(serialNumber))
                        .findFirst()
                        .orElse(null);
    }

    public List<Guitar> search(GuitarSpec guitarSpec){
        return guitars.stream().filter(guitar1 -> guitar1.getGuitarSpec().equals(guitarSpec))
                                .collect(Collectors.toList());
    }
}
