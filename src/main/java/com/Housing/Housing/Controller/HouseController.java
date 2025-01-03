package com.Housing.Housing.Controller;

import com.Housing.Housing.Model.House;
import com.Housing.Housing.Service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class HouseController {
    @Autowired
    HouseService houseService;

//    save data
    @PostMapping("/data")
    public void addHouseData(@RequestBody List<House> data){
        houseService.addHouseData(data);
    }

//    average find all
    @GetMapping("/avgall")
    public int AvgSalePrice(){
      return houseService.avgSalePrice();
    }

//    avg by location
    @GetMapping("/avgByLocation")
    public List<Object> avgByLocation(){
        return houseService.avgByLocation();
    }

//    maximum price
    @GetMapping("/maxPrice")
    public List<Object> maxSalePrice(){
        return houseService.maxSalePrice();
    }

//    minimum price
    @GetMapping("/minPrice")
    public List<Object> minSalePrice(){
        return houseService.minSalePrice();
    }

//    find by all
    @GetMapping("/get")
    public List<House> getAllHouse(){
        return houseService.getAllHouse();
    }

//    find by single
    @GetMapping("/house/{id}")
    public Optional<House> getHouseById(@PathVariable Long id){
        return houseService.getHouseById(id);
    }

//    delete single
    @DeleteMapping("/house/{id}")
    public void delete(@PathVariable("id") long id) {
        houseService.delete(id);
    }
}