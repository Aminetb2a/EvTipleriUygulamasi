package patika.dev.definex.repos;

import patika.dev.definex.model.House;
import patika.dev.definex.model.SummerHouse;
import patika.dev.definex.model.Villa;

import java.math.BigDecimal;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Repository {
    private final static int minRoom = 1;
    private final static int maxRoom = 5;
    private final static int minSalon = 1;
    private final static int maxSalon = 2;
    private final static double minArea = 50.0;
    private final static double maxArea = 599.0;
    private final static int minPrice = 10000;
    private final static int maxPrice = 9999999;
    private final static Random rand = new Random();
    public List<House> generateHouses(Integer houseNumber) {
        return Stream.generate(() ->
                House.builder()
                        .id(rand.nextLong())
                        .area(rand.nextDouble(maxArea - minArea + 1) + minArea)
                        .roomNumber(rand.nextInt(maxRoom - minRoom + 1) + minRoom)
                        .salonNumber(rand.nextInt(maxSalon - minSalon + 1) + minSalon)
                        .price(BigDecimal.valueOf(rand.nextInt(maxPrice - minPrice + 1) + minPrice))
                        .build()
        ).limit(houseNumber).collect(Collectors.toList());
    }

    public List<Villa> generateVillas(Integer villaNumber) {
        return Stream.generate(() ->
                Villa.builder()
                        .id(rand.nextLong())
                        .area(rand.nextDouble(maxArea - minArea + 1) + minArea)
                        .roomNumber(rand.nextInt(maxRoom - minRoom + 1) + minRoom)
                        .salonNumber(rand.nextInt(maxSalon - minSalon + 1) + minSalon)
                        .price(BigDecimal.valueOf(rand.nextInt(maxPrice - minPrice + 1) + minPrice))
                        .build()
        ).limit(villaNumber).collect(Collectors.toList());
    }

    public List<SummerHouse> generateSummerHouses(Integer summerHouseNumber) {
        return Stream.generate(() ->
                SummerHouse.builder()
                        .id(rand.nextLong())
                        .area(rand.nextDouble(maxArea - minArea + 1) + minArea)
                        .roomNumber(rand.nextInt(maxRoom - minRoom + 1) + minRoom)
                        .salonNumber(rand.nextInt(maxSalon - minSalon + 1) + minSalon)
                        .price(BigDecimal.valueOf(rand.nextInt(maxPrice - minPrice + 1) + minPrice))
                        .build()
        ).limit(summerHouseNumber).collect(Collectors.toList());
    }


}
