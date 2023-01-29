package patika.dev.definex.service;

import patika.dev.definex.model.Home;

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

    public List<Home> getHouseListByRoomAndSalonNumber(Collection<? extends Home> homeList, Integer roomNumber, Integer salonNumber) {
        return homeList.stream()
                .filter(home -> home.getRoomNumber().equals(roomNumber))
                .filter(home -> home.getLivingRoomNumber().equals(salonNumber))
                .collect(Collectors.toList());
    }

}
