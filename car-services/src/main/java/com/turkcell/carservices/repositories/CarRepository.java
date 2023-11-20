package com.turkcell.carservices.repositories;

import com.turkcell.carservices.entities.Car;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CarRepository extends MongoRepository<Car,String> {
    Car findByInventoryCode(String inventoryCode);
}
