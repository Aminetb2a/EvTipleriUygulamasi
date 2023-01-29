package patika.dev.definex.repos;

import patika.dev.definex.model.House;
import patika.dev.definex.model.SummerHouse;
import patika.dev.definex.model.Villa;

import java.util.List;

public interface Repository {

    public List<House> generateHouses(Integer houseNumber);

    public List<Villa> generateVillas(Integer villaNumber);

    public List<SummerHouse> generateSummerHouses(Integer summerHouseNumber);

}
