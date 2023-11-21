package com.turkcell.rentalservices.controllers;


import com.turkcell.rentalservices.services.RentalService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/rental")
@RestController
@RequiredArgsConstructor
public class RentalController {
    private final RentalService rentalService;

    @GetMapping("/submitRental")
    public String submitRental(@RequestParam String inventoryCode) {
        return rentalService.submitRental(inventoryCode);
    }
}