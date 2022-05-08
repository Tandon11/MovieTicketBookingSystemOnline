package com.example.backend.Controller;

import com.example.backend.DTO.BookingObject;
import com.example.backend.Model.Booking;
import com.example.backend.Service.Booking.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @PostMapping("/booking/add")
    public Booking add(@RequestBody BookingObject booking) {
        return bookingService.addBooking(booking);
    }

    @GetMapping("/booking")
    public List<Booking> listAll(){
        return bookingService.listAllBooking();
    }

    @GetMapping("booking/getByUser/{email}")
    public List<Booking> listByUsers(@PathVariable String email){
        return bookingService.listByUser(email);
    }

  //  @GetMapping("/booking/endBooking/{bookingid}")
  //  public boolean endBooking(@PathVariable Integer bookingid) {
   //     return bookingService.endBooking(bookingid);
   // }

    @GetMapping("/booking/allBooking")
    public List<Booking> allBookings(){
        return bookingService.listAllBooking();
    }
}
