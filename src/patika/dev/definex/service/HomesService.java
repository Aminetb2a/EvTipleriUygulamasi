package patika.dev.definex.service;

import lombok.NoArgsConstructor;
import patika.dev.definex.model.Home;
import patika.dev.definex.model.House;
import patika.dev.definex.model.SummerHouse;
import patika.dev.definex.model.Villa;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;

@NoArgsConstructor
public class HomesService extends BaseService {


    public BigDecimal getAllHousesTotalPrice(Collection<? extends Home> homesList) {
        return getTotalPrice(homesList);
    }

    public BigDecimal getHousesTotalPrice(List<House> houseList) {
        return getTotalPrice(houseList);
    }

    public BigDecimal getVillasTotalPrice(List<Villa> villaList) {
        return getTotalPrice(villaList);
    }

    public BigDecimal getSummerHousesTotalPrice(List<SummerHouse> summerHouseList) {
        return getTotalPrice(summerHouseList);
    }

    public Double getAllHousesAverageArea(Collection<? extends Home> homesList) {
        return getAverageArea(homesList);
    }

    public Double getHousesAverageArea(List<House> houseList) {
        return getAverageArea(houseList);
    }


    public Double getVillasAverageArea(List<Villa> villaList) {
        return getAverageArea(villaList);
    }

    public Double getSummerHousesAverageArea(List<SummerHouse> summerHouseList) {
        return getAverageArea(summerHouseList);
    }

}
