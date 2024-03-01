package com.Housing.Housing.Repository;

import com.Housing.Housing.Model.House;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@EnableJpaRepositories
public interface HouseRepository extends JpaRepository<House, Long> {
//    All over avg
    @Query(value = "select avg(salePrice) from House")
    int avgAllSell();

//    Group by location avg
    @Query(value = "SELECT location, AVG(salePrice) FROM House GROUP BY location")
    List<Object> avgByLocation();

//    Maximum price
    @Query(value = "SELECT id,salePrice FROM House WHERE salePrice = (SELECT MAX(salePrice) FROM House)")
    List<Object> maxSalePrice();

//    Minimum price
    @Query(value = "SELECT id,salePrice FROM House WHERE salePrice = (SELECT MIN(salePrice) FROM House)")
    List<Object> minSalePrice();
}