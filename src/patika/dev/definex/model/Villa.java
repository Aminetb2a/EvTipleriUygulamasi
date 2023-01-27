package patika.dev.definex.model;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public class Villa extends Home {
    private Boolean hasPool;
    private Double poolSize;
    private Double gardenArea;
    private Boolean hasGarden;
    private Boolean hasLaundryRoom;

}
