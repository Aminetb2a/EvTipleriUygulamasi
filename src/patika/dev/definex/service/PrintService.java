package patika.dev.definex.service;

import lombok.Data;
import patika.dev.definex.model.Home;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.stream.Stream;

@Data
public class PrintService {

    private String leftAlignFormat = "| %-15s | %,-15.3f | %-15.3f |%n";

    /**
     * This method prints the header of the table
     */
    public void printHeader() {
        System.out.println("\n\n\n");
        printLine();
        System.out.format("|                Ev Tipleri Uygulamasi                |%n");
        printLine();
        System.out.format("| Home Type       | Total price     | Average Area    |%n");
        printLine();
    }

    /**
     * This method prints the footer of the table
     */
    public void printFooter() {
        System.out.format("|                                                     |%n");
        printLine();
        System.out.println("\n\n\n");
    }

    /**
     * This method prints the table line separator
     */
    public void printLine() {
        System.out.format("+-----------------+-----------------+-----------------+%n");
    }

    /**
     * This method prints the Homes total prices and average area
     */
    public void printHomeDetails(String houseType, BigDecimal totalPrice, Double avrgArea) {
        System.out.format(getLeftAlignFormat(), houseType, totalPrice, avrgArea);
        printLine();
    }

    /**
     * This method prints the House object details
     */
    public void printHouseDetails(Collection<? extends Home>... values) {
        Stream.of(values)
                .flatMap(Collection::parallelStream)
                .forEach(System.out::println);
    }
}
