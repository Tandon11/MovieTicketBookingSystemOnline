package com.example.backend.Repository;

import com.example.backend.Model.Seats;
import com.example.backend.Model.Shows;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface SeatRepository extends JpaRepository<Seats, Integer> {

    @Query("select cost from Seats where seat_type = ?1")
    String getSeatCost(String seat_type);

    @Query("select s from Seats s where s.movieId = ?1 and s.locationId=?2 and s.theatreId=?3")
    List<Seats> seatByMovieandLocationId(Integer movieId, Integer LocationId, Integer theatreId);

    @Modifying
    @Transactional
    @Query(nativeQuery = true, value = "Update seats s set s.status = 1 where s.seatid IN (:seatId)")
    Integer updateSeats(List<Integer> seatId);
    // return value int signifies the number of values updated in database

}
