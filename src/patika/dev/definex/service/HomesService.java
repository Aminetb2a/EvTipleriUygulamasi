package patika.dev.definex.service;

import lombok.NoArgsConstructor;
import patika.dev.definex.model.Home;
import patika.dev.definex.model.House;
import patika.dev.definex.model.SummerHouse;
import patika.dev.definex.model.Villa;
import patika.dev.definex.repos.Repository;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@NoArgsConstructor
public class HomesService extends BaseService {

    private List<Home> homesList;
    private List<House> houseList;
    private List<Villa> villaList;
    private List<SummerHouse> summerHouseList;

    public void generateData() {
        Repository generatorService = new Repository();
        villaList = generatorService.generateVillas(5);
        houseList = generatorService.generateHouses(7);
        summerHouseList = generatorService.generateSummerHouses(3);
        homesList = Stream.of(houseList, villaList, summerHouseList)
                .flatMap(Collection::parallelStream)
                .collect(Collectors.toList());
    }

    public Double getAllHousesAverageArea() {
        return getAverageArea(homesList);
    }


    public Double getVillasAverageArea() {
        return getAverageArea(villaList);
    }

    public Double getSummerHousesAverageArea() {
        return getAverageArea(summerHouseList);
    }

    public BigDecimal getAllHousesTotalPrice() {
        return getTotalPrice(homesList);
    }

    public BigDecimal getHousesTotalPrice() {
        return getTotalPrice(houseList);
    }

    public BigDecimal getVillasTotalPrice() {
        return getTotalPrice(villaList);
    }

    public BigDecimal getSummerHousesTotalPrice() {
        return getTotalPrice(summerHouseList);
    }
}
