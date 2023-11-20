package com.turkcell.carservices.dto;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CarRequest {
    private String inventoryCode;
    private String brand;
    private String model;
    private String colour;
    private short modelYear;
    private Double dailyPrice;
    private Boolean state;

}
