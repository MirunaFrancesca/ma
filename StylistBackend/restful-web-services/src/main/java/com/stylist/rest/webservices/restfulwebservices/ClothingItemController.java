package com.stylist.rest.webservices.restfulwebservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.servlet.annotation.WebFilter;
import java.util.List;

@CrossOrigin(origins = "http://localhost:8100", maxAge = 3600)
@RestController
@RequestMapping("/outfits-service")
public class ClothingItemController {

    @Autowired
    private IClothingItemRepo clothingItemRepo;

    @GetMapping(path="/all-outfits")
    public List<ClothingItem> getAllOutfits(){
        List<ClothingItem> allItems = clothingItemRepo.findAll();
        return allItems;
    }

    @PostMapping("/update-outift")
    public ClothingItem saveClothingItem(@RequestBody ClothingItem newClothingItem) {
        return this.clothingItemRepo.save(newClothingItem);
    }

    @CrossOrigin(origins = "http://localhost:8100", maxAge = 3600)
    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping("/delete-outfit/{id}")
    public boolean deleteClothingItem(@PathVariable("id") int id){
        this.clothingItemRepo.deleteById(id);
        return this.clothingItemRepo.findById(id).isEmpty();
    }

}
