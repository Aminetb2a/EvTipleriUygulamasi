package patika.dev.definex.model;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public class SummerHouse extends Home {
    private Boolean hasBalcony;
    private Boolean hasTerrace;

}
