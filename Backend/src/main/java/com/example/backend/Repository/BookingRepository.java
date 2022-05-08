package com.example.backend.Repository;

import com.example.backend.Model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Integer> {

    @Query("select b from Booking b where b.email = ?1")
    List<Booking> listBookingByUser(String email);

    //@Modifying
   // @Transactional
   // @Query("update Booking b set b.paid = 1 where b.bookingid = ?1")
   // int endBooking(Integer bookingid);
}
