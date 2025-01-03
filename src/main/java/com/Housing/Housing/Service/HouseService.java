package com.Housing.Housing.Service;

import com.Housing.Housing.Model.House;
import com.Housing.Housing.Repository.HouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HouseService {

    @Autowired
    HouseRepository houseRepository;

//    push data
    public List<House> addHouseData(List<House> data) {
        return houseRepository.saveAll(data);
    }

//    avg by all
    public int avgSalePrice(){
        return houseRepository.avgAllSell();
    }

//    avg by location
    public List<Object> avgByLocation() {
        return houseRepository.avgByLocation();
    }

//    maximum
    public List<Object> maxSalePrice() {
        return houseRepository.maxSalePrice();
    }

//    minimum price
    public List<Object> minSalePrice() {
        return houseRepository.minSalePrice();
    }
//    find all
    public List<House> getAllHouse() {
        return houseRepository.findAll();
    }

//    find single
    public Optional<House> getHouseById(Long id) {
        return houseRepository.findById(id);
    }

//    delete single
    public void delete(long id) {
        houseRepository.deleteById(id);
    }
}