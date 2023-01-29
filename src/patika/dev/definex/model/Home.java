package patika.dev.definex.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import patika.dev.definex.HouseType;

import java.math.BigDecimal;

@Getter
@ToString
@SuperBuilder
@AllArgsConstructor
public abstract class Home {

    private Long id;
    private HouseType type;
    private Double area;
    private BigDecimal price;
    private Integer roomNumber;
    private Integer livingRoomNumber;
    private Integer floorNumber;
    private Integer kitchenNumber;
    private Integer bathroomNumber;

}
