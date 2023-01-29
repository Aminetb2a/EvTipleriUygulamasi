package patika.dev.definex.service;

import patika.dev.definex.model.Home;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BaseService {

    /**
     * It takes a variable number of collections of homes and returns a list of all the homes in those
     * collections.
     *
     * @return A list of all the homes in the values array.
     */
    public List<Home> getAllHomes(List<? extends Home>... homes) {
        return Stream.of(homes)
                .flatMap(Collection::parallelStream)
                .collect(Collectors.toList());
    }

    /**
     * Get the total price of a collection of homes.
     *
     * @param homeList a collection of Home objects.
     * @return A BigDecimal
     */
    public <T extends Home> BigDecimal getTotalPrice(List<T> homeList) {
        return homeList.stream()
                .map(Home::getPrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    /**
     * Get the average area of a collection of homes.
     *
     * @param homeList a collection of Home objects
     * @return A Double
     */
    public <T extends Home> Double getAverageArea(List<T> homeList) {
        return homeList.stream()
                .mapToDouble(Home::getArea)
                .average().getAsDouble();
    }

    /**
     * This method can be more generic than it is.
     * It takes a collection of homes, a room number and a salon number as parameters and returns a
     * list of homes that have the same room and salon number as the parameters
     *
     * @param homeList    The list of homes that you want to filter.
     * @param roomNumber  The number of rooms in the house.
     * @param salonNumber The number of living rooms in the house.
     * @return A list of homes that have the same number of rooms and salons.
     */
    public List<Home> filterHouseListByRoomAndSalonNumber(List<? extends Home> homeList, Integer roomNumber, Integer salonNumber) {
        return homeList.stream()
                .filter(home -> home.getRoomNumber().equals(roomNumber))
                .filter(home -> home.getLivingRoomNumber().equals(salonNumber))
                .collect(Collectors.toList());
    }

}
