package models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import models.enums.Builder;
import models.enums.Type;
import models.enums.Wood;

import java.util.Objects;

@Data
@lombok.Builder
@AllArgsConstructor
@NoArgsConstructor

public class GuitarSpec {
    private Builder builder;
    private String model;
    private Type type;
    private Wood backWood;
    private Wood topWood;
    private Integer numStrings;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GuitarSpec that = (GuitarSpec) o;
        return builder == that.builder
                && Objects.equals(model, that.model)
                && type == that.type
                && backWood == that.backWood
                && topWood == that.topWood
                && Objects.equals(numStrings, that.numStrings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(builder, model, type, backWood, topWood, numStrings);
    }
}
