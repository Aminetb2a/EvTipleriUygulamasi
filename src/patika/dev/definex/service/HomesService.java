package patika.dev.definex.service;

import lombok.NoArgsConstructor;
import patika.dev.definex.model.Home;
import patika.dev.definex.model.House;
import patika.dev.definex.model.SummerHouse;
import patika.dev.definex.model.Villa;

import java.math.BigDecimal;
import java.util.List;

@NoArgsConstructor
public class HomesService extends BaseService {

    /**
     * This method returns the total price of all the houses in the homesList collection.
     *
     * @param homesList A collection of Home objects.
     * @return The total price of all the homes in the collection.
     */
    public BigDecimal getAllHousesTotalPrice(List<Home> homesList) {
        return getTotalPrice(homesList);
    }

    /**
     * Get the total price of a list of houses.
     *
     * @param houseList The list of houses to be calculated
     * @return The total price of all the houses in the list.
     */
    public BigDecimal getHousesTotalPrice(List<House> houseList) {
        return getTotalPrice(houseList);
    }

    /**
     * Get the total price of a list of villas.
     *
     * @param villaList The list of villas to be calculated
     * @return The total price of all the villas in the list.
     */
    public BigDecimal getVillasTotalPrice(List<Villa> villaList) {
        return getTotalPrice(villaList);
    }

    /**
     * Get the total price of a list of summer houses.
     *
     * @param summerHouseList The list of summer houses to be calculated
     * @return The total price of all the summer houses in the list.
     */
    public BigDecimal getSummerHousesTotalPrice(List<SummerHouse> summerHouseList) {
        return getTotalPrice(summerHouseList);
    }

    /**
     * This method returns the average area of all the houses in the homesList collection.
     *
     * @param homesList a collection of homes
     * @return The average area of all the houses in the collection.
     */
    public Double getAllHousesAverageArea(List<Home> homesList) {
        return getAverageArea(homesList);
    }

    /**
     * This method returns the average area of a list of houses.
     *
     * @param houseList a list of House objects
     * @return The average area of the houses in the list.
     */
    public Double getHousesAverageArea(List<House> houseList) {
        return getAverageArea(houseList);
    }

    /**
     * This method returns the average area of a list of villas.
     *
     * @param villaList a list of Villa objects
     * @return The average area of the villas in the list.
     */
    public Double getVillasAverageArea(List<Villa> villaList) {
        return getAverageArea(villaList);
    }

    /**
     * This method returns the average area of a list of sumer houses.
     *
     * @param summerHouseList a list of SummerHouse objects
     * @return The average area of the sumer houses in the list.
     */
    public Double getSummerHousesAverageArea(List<SummerHouse> summerHouseList) {
        return getAverageArea(summerHouseList);
    }

}
