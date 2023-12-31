package com.turkcell.carservices.services;

import com.turkcell.carservices.dto.CarRequest;
import com.turkcell.carservices.entities.Car;
import com.turkcell.carservices.repositories.CarRepository;
import com.turkcell.carservices.services.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CarManager implements CarService {

    private final CarRepository carRepository;

    @Override
    public void add(CarRequest request) {
        Car car = Car.builder()
                .inventoryCode(request.getInventoryCode())
                .brand(request.getBrand())
                .model(request.getModel())
                .colour(request.getColour())
                .modelYear(request.getModelYear())
                .dailyPrice(request.getDailyPrice())
                .state(request.getState())
                .build();
        carRepository.save(car);
    }

    @Override
    public void update(String inventoryCode, CarRequest request) {
        Car car = carRepository.findByInventoryCode(inventoryCode);
        car.setBrand(request.getBrand());
        car.setModel(request.getModel());
        car.setModelYear(request.getModelYear());
        car.setColour(request.getColour());
        car.setInventoryCode(request.getInventoryCode());
        car.setDailyPrice(request.getDailyPrice());
        car.setState(request.getState());
        carRepository.save(car);
    }

    @Override
    public void delete(String inventoryCode) {
        Car car = carRepository.findByInventoryCode(inventoryCode);
        carRepository.delete(car);
    }

    @Override
    public List<Car> getAll() {
        return  carRepository.findAll();
    }

    @Override
    public Car getByInventoryCode(String inventoryCode) {
        return carRepository.findByInventoryCode(inventoryCode);
    }

    @Override
    public Boolean getStateByInventoryCode(String inventoryCode) {
        Car car = getByInventoryCode(inventoryCode);
        if (car != null){
            return car.getState();
        }
        return false;
    }


}