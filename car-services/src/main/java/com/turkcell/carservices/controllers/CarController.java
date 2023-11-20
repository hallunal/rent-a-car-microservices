package com.turkcell.carservices.controllers;

import com.turkcell.carservices.dto.CarRequest;
import com.turkcell.carservices.entities.Car;
import com.turkcell.carservices.services.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/car")
@RestController
@RequiredArgsConstructor
public class CarController {
    private final CarService carService;

    @PostMapping("/add")
    public void add(@RequestBody CarRequest request) {
        carService.add(request);
    }

    @PutMapping("/update")
    public void update(@RequestParam String inventoryCode,@RequestBody CarRequest request) {
        carService.update(inventoryCode,request);
    }
    @DeleteMapping("/delete")
    public void delete(String inventoryCode){
        carService.delete(inventoryCode);
    }
    @GetMapping("/getAll")
    public List<Car> getAll(){
        return carService.getAll();
    }
    @GetMapping("/getByInventoryCode")
    public Car getByInventoryCode(@RequestParam String inventoryCode){
        return carService.getByInventoryCode(inventoryCode);
    }

    @GetMapping("/getState")
    public Boolean getState(@RequestParam String inventoryCode){
        return carService.getStateByInventoryCode(inventoryCode);
    }
    @GetMapping("/deneme")
    public String deneme(){
        return "Deneme";
    }

}
