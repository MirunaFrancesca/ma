package com.stylist.rest.webservices.restfulwebservices;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ClothingItemDAOServiceCommandLineRunner implements CommandLineRunner {

    private static final Logger log =  LoggerFactory.getLogger(ClothingItemDAOServiceCommandLineRunner.class);

    @Autowired
    private ClothingItemDAOService clothingItemDAOService;

    @Override
    public void run(String... args) throws Exception {
//        ClothingItem clothingItem = new ClothingItem("Miru", "url");
//        int insert = clothingItemDAOService.insert(clothingItem);
//        log.info("New user is created" + insert);
    }

}
