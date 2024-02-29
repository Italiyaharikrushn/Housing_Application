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

    public List<House> addHouseData(List<House> data) {
        return houseRepository.saveAll(data);
    }

    public int avgSalePrice(){
        return houseRepository.avgAllSell();
    }

    public List<Object> avgByLocation() {
        return houseRepository.avgByLocation();
    }

    public List<Object> maxSalePrice() {
        return houseRepository.maxSalePrice();
    }

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

    public void delete(long id) {
        houseRepository.deleteById(id);
    }
}