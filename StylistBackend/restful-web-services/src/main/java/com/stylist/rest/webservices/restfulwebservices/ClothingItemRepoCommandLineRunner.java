package com.stylist.rest.webservices.restfulwebservices;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ClothingItemRepoCommandLineRunner implements CommandLineRunner {

    private static final Logger log =  LoggerFactory.getLogger(ClothingItemDAOServiceCommandLineRunner.class);

    @Autowired
    private IClothingItemRepo clothingItemRepo;

    @Override
    public void run(String... args) throws Exception {

        for(int i=0; i<10; i++) {
            ClothingItem clothingItem = new ClothingItem("Outfit no. ",
                    "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/index-1607454775.jpg?crop=0.296xw:0.593xh;0.353xw,0.00326xh&resize=640:*");
            clothingItemRepo.save(clothingItem);
            log.info("New item is created " + clothingItem);
        }

        Optional<ClothingItem> clothingWithIdOne = clothingItemRepo.findById(1);
        log.info("Item clothing is retrieved " + clothingWithIdOne);

        List<ClothingItem> allItems = clothingItemRepo.findAll();
        log.info("All items are " + allItems);
    }
}
