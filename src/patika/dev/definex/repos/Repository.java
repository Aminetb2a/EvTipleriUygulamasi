package patika.dev.definex.repos;

import patika.dev.definex.model.House;
import patika.dev.definex.model.SummerHouse;
import patika.dev.definex.model.Villa;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Repository {
    private final static int minRoom = 1;
    private final static int maxRoom = 5;
    private final static int minSalon = 0;
    private final static int maxSalon = 2;
    private final static double minArea = 50.0;
    private final static double maxArea = 599.0;
    private final static int minPrice = 10000;
    private final static int maxPrice = 9999999;
    private final static Random rand = new Random();

    public List<House> generateHouses(Integer houseNumber) {
        List<House> houseList = new ArrayList<>();

        for (Integer i = 1; i < houseNumber + 1; i++) {
            houseList.add(
                    House.builder()
                            .id(i)
                            .area(rand.nextDouble(maxArea - minArea + 1) + minArea)
                            .roomNumber(rand.nextInt(maxRoom - minRoom + 1) + minRoom)
                            .salonNumber(rand.nextInt(maxSalon - minSalon + 1) + minSalon)
                            .price(BigDecimal.valueOf(rand.nextInt(maxPrice - minPrice + 1) + minPrice))
                            .build()
            );
        }
        return houseList;
    }

    public List<Villa> generateVillas(Integer villaNumber) {
        List<Villa> villaList = new ArrayList<>();

        for (Integer i = 1; i < villaNumber + 1; i++) {
            villaList.add(
                    Villa.builder()
                            .id(i)
                            .area(rand.nextDouble(maxArea - minArea + 1) + minArea)
                            .roomNumber(rand.nextInt(maxRoom - minRoom + 1) + minRoom)
                            .salonNumber(rand.nextInt(maxSalon - minSalon + 1) + minSalon)
                            .price(BigDecimal.valueOf(rand.nextInt(maxPrice - minPrice + 1) + minPrice))
                            .build()
            );
        }
        return villaList;
    }

    public List<SummerHouse> generateSummerHouses(Integer summerHouseNumber) {
        List<SummerHouse> houseList = new ArrayList<>();

        for (Integer i = 1; i < summerHouseNumber + 1; i++) {
            houseList.add(
                    SummerHouse.builder()
                            .id(i)
                            .area(rand.nextDouble(maxArea - minArea + 1) + minArea)
                            .roomNumber(rand.nextInt(maxRoom - minRoom + 1) + minRoom)
                            .salonNumber(rand.nextInt(maxSalon - minSalon + 1) + minSalon)
                            .price(BigDecimal.valueOf(rand.nextInt(maxPrice - minPrice + 1) + minPrice))
                            .build()
            );
        }
        return houseList;
    }


}
