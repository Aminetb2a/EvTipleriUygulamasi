package patika.dev.definex.service;

import lombok.NoArgsConstructor;
import patika.dev.definex.model.Home;
import patika.dev.definex.model.House;
import patika.dev.definex.model.SummerHouse;
import patika.dev.definex.model.Villa;
import patika.dev.definex.repos.Repository;

import java.math.BigDecimal;
import java.util.List;

@NoArgsConstructor
public class BaseService {

    private List<Home> homesList;
    private List<House> houseList;
    private List<Villa> villaList;
    private List<SummerHouse> summerHouseList;

    public void generateData() {
        Repository generatorService = new Repository();
        villaList = generatorService.generateVillas(4);
        houseList = generatorService.generateHouses(4);
        summerHouseList = generatorService.generateSummerHouses(4);
    }

    public BigDecimal getTotalPrice() {
        return null;
    }

    public BigDecimal getHousesTotalPrice() {
        return null;
    }

    public BigDecimal getVillasTotalPrice() {
        return null;
    }

    public BigDecimal getSummerHousesTotalPrice() {
        return null;
    }

    public Double getTotalArea() {
        return null;
    }

    public Double getHousesTotalArea() {
        return null;
    }

    public Double getVillasTotalArea() {
        return null;
    }

    public Double getSummerHousesTotalArea() {
        return null;
    }

    public List<House> getHouseListByRoomAndSalonNumber(Integer roomNumber, Integer salonNumber) {
        return null;
    }
}
