package models;

import lombok.*;
import models.enums.Type;
import models.enums.Wood;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Guitar {
    private String serialNumber;
    private double price;
    GuitarSpec guitarSpec;

}
