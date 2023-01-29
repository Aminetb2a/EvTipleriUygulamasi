package patika.dev.definex.service;

import patika.dev.definex.model.Home;
import patika.dev.definex.model.House;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BaseService {

    public List<Home> getAllHomes(Collection<? extends Home>... values) {
        return Stream.of(values)
                .flatMap(Collection::parallelStream)
                .collect(Collectors.toList());
    }

    public BigDecimal getTotalPrice(Collection<? extends Home> homeList) {
        return homeList.stream()
                .map(Home::getPrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public Double getAverageArea(Collection<? extends Home> homeList) {
        return homeList.stream()
                .mapToDouble(Home::getArea)
                .sum() / homeList.size();
    }

    public List<House> getHouseListByRoomAndSalonNumber(Integer roomNumber, Integer salonNumber) {
        return null;
    }

}
