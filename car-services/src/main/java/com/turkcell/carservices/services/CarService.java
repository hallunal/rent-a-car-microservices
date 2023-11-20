package com.turkcell.carservices.services;

import com.turkcell.carservices.dto.CarRequest;
import com.turkcell.carservices.entities.Car;


import java.util.List;

public interface CarService {
    void add(CarRequest request);
    void update(String inventoryCode,CarRequest request);
    void delete(String inventoryCode);
    List<Car> getAll();
    Car getByInventoryCode(String inventoryCode);

    Boolean getStateByInventoryCode(String inventoryCode);
}
