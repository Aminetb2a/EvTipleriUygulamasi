package patika.dev.definex.service;

import patika.dev.definex.model.House;
import patika.dev.definex.model.SummerHouse;
import patika.dev.definex.model.Villa;
import patika.dev.definex.repos.Repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static patika.dev.definex.HouseType.*;

public class GeneratorService implements Repository {

    private final static int minRoom = 1;
    private final static int maxRoom = 5;
    private final static int minSalon = 1;
    private final static int maxSalon = 2;
    private final static double minArea = 60.0;
    private final static double maxArea = 599.0;
    private final static int minPrice = 10000;
    private final static int maxPrice = 9999999;
    private final static Random rand = new Random();

    /**
     * It generates a list of houses with random fields values
     *
     * @param houseNumber The number of houses to be generated
     * @return A list of House object
     */
    public List<House> generateHouses(Integer houseNumber) {
        return Stream.generate(() ->
                House.builder()
                        .id(rand.nextLong())
                        .type(HOUSE)
                        .area(rand.nextDouble(maxArea - minArea + 1) + minArea)
                        .roomNumber(rand.nextInt(maxRoom - minRoom + 1) + minRoom)
                        .livingRoomNumber(rand.nextInt(maxSalon - minSalon + 1) + minSalon)
                        .price(BigDecimal.valueOf(rand.nextInt(maxPrice - minPrice + 1) + minPrice))
                        .bathroomNumber(rand.nextInt(maxSalon - minSalon + 1) + minSalon)
                        .kitchenNumber(rand.nextInt(maxSalon - minSalon + 1) + minSalon)
                        .floorNumber(rand.nextInt(maxRoom - minRoom + 1) + minRoom)
                        .build()
        ).limit(houseNumber).collect(Collectors.toList());
    }

    /**
     * It generates a list of villas with random fields values
     *
     * @param villaNumber The number of villas to be generated
     * @return A list of House object
     */
    public List<Villa> generateVillas(Integer villaNumber) {
        return Stream.generate(() ->
                Villa.builder()
                        .id(rand.nextLong())
                        .type(VILLA)
                        .area(rand.nextDouble(maxArea - minArea + 1) + minArea)
                        .roomNumber(rand.nextInt(maxRoom - minRoom + 1) + minRoom)
                        .livingRoomNumber(rand.nextInt(maxSalon - minSalon + 1) + minSalon)
                        .price(BigDecimal.valueOf(rand.nextInt(maxPrice - minPrice + 1) + minPrice))
                        .bathroomNumber(rand.nextInt(maxSalon - minSalon + 1) + minSalon)
                        .kitchenNumber(rand.nextInt(maxSalon - minSalon + 1) + minSalon)
                        .floorNumber(rand.nextInt(maxRoom - minRoom + 1) + minRoom)
                        .build()
        ).limit(villaNumber).collect(Collectors.toList());
    }

    /**
     * It generates a list of summer houses with random fields values
     *
     * @param summerHouseNumber The number of summer houses to be generated
     * @return A list of House object
     */
    public List<SummerHouse> generateSummerHouses(Integer summerHouseNumber) {
        return Stream.generate(() ->
                SummerHouse.builder()
                        .id(rand.nextLong())
                        .type(SUMMER_HOUSE)
                        .area(rand.nextDouble(maxArea - minArea + 1) + minArea)
                        .roomNumber(rand.nextInt(maxRoom - minRoom + 1) + minRoom)
                        .livingRoomNumber(rand.nextInt(maxSalon - minSalon + 1) + minSalon)
                        .price(BigDecimal.valueOf(rand.nextInt(maxPrice - minPrice + 1) + minPrice))
                        .bathroomNumber(rand.nextInt(maxSalon - minSalon + 1) + minSalon)
                        .kitchenNumber(rand.nextInt(maxSalon - minSalon + 1) + minSalon)
                        .floorNumber(rand.nextInt(maxRoom - minRoom + 1) + minRoom)
                        .build()
        ).limit(summerHouseNumber).collect(Collectors.toList());
    }

}
