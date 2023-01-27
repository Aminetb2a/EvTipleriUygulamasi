package patika.dev.definex.model;

import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;

@Getter
@ToString
@SuperBuilder
public abstract class Home {
    private Integer id;
    private Double area;
    private BigDecimal price;
    private Integer roomNumber;
    private Integer floorNumber;
    private Integer salonNumber;
    private Integer kitchenNumber;
    private Integer bathroomNumber;

}
