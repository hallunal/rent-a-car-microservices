package com.turkcell.rentalservices.repositories;

import com.turkcell.rentalservices.entities.Rental;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentalRepository extends JpaRepository<Rental, Integer> {}
