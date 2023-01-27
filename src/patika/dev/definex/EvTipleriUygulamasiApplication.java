package patika.dev.definex;


import patika.dev.definex.service.HomesService;

public class EvTipleriUygulamasiApplication {

    public static void main(String[] args) {

        HomesService service = new HomesService();
        service.generateData();

    }

}

