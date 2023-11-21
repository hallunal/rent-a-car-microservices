package com.turkcell.rentalservices.services;

import com.turkcell.rentalservices.repositories.RentalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
@RequiredArgsConstructor
public class RentalManager implements RentalService {

    private final RentalRepository rentalRepository;
    private final WebClient.Builder webClientBuilder;

    @Override
    public String submitRental(String inventoryCode) {
        Boolean state =
                webClientBuilder
                        .build()
                        .get()
                        .uri(
                                "http://car-services/api/car/getState",
                                (uriBuilder) -> uriBuilder.queryParam("inventoryCode", inventoryCode).build())
                        .retrieve()
                        .bodyToMono(Boolean.class)
                        .block();
        if (state) return "Arac kiralamaya uygun";
        else return "Arac kiralamaya uygun degil";
    }
}