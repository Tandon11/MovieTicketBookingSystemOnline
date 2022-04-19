package com.example.backend.Repository;

import com.example.backend.Model.Seats;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface SeatRepository extends JpaRepository<Seats, Integer> {

    @Query("select cost from Seats where seat_type = ?1")
    String getSeatCost(String seat_type);
}
