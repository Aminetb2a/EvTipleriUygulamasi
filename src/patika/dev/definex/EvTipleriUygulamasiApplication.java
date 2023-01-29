package patika.dev.definex;


import patika.dev.definex.model.Home;
import patika.dev.definex.model.House;
import patika.dev.definex.model.SummerHouse;
import patika.dev.definex.model.Villa;
import patika.dev.definex.repos.Repository;
import patika.dev.definex.service.HomesService;
import patika.dev.definex.service.PrintService;

import java.util.List;

public class EvTipleriUygulamasiApplication {

    public static void main(String[] args) {

        /***
         * Generate random different homes
         */

        PrintService print = new PrintService();
        HomesService service = new HomesService();
        Repository generatorService = new Repository();
        // generate 7 houses
        List<House> houseList = generatorService.generateHouses(7);
        // generate 5 villas
        List<Villa> villaList = generatorService.generateVillas(5);
        // generate 3 summer houses
        List<SummerHouse> summerHouseList = generatorService.generateSummerHouses(3);
        // combine all houses in a list
        List<Home> homesList = service.getAllHomes(houseList, villaList, summerHouseList);

        // uncomment if you want to see the houses details
        //print.printHouseDetails(houseList, villaList, summerHouseList);

        //print details needed
        print.printHeader();
        print.printHomeDetails("House", service.getHousesTotalPrice(houseList), service.getHousesAverageArea(houseList));
        print.printHomeDetails("Villa", service.getVillasTotalPrice(villaList), service.getVillasAverageArea(villaList));
        print.printHomeDetails("Summer House", service.getSummerHousesTotalPrice(summerHouseList), service.getSummerHousesAverageArea(summerHouseList));
        print.printHomeDetails("Total", service.getAllHousesTotalPrice(homesList), service.getAllHousesAverageArea(homesList));
        print.printFooter();

        // print filtered houses by room number and living room
        System.out.println("|                   House Filtering                  |");
        print.printHouseDetails(service.filterHouseListByRoomAndSalonNumber(homesList, 3, 1));
    }

}

