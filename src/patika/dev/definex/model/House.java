package patika.dev.definex.model;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
public class House extends Home {
    @Getter
    private static Integer counter = 0;

    {
        counter++;
    }

}
