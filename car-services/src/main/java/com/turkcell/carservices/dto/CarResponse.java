package com.turkcell.carservices.dto;


import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CarResponse {
    private String brand;
    private String model;
    private String colour;
    private short modelYear;
    private Boolean state;
}
