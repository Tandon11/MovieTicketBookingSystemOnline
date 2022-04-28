package com.example.backend.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Seats {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer seatid;
    private String seat_type;
    private String cost;

    private Integer theatreId;
    private Integer locationId;
    private Integer movieId;

    public Seats() {
    }

    public Seats(Integer seatid, String seat_type, String cost, Integer theatreId, Integer locationId, Integer movieId) {
        this.seatid = seatid;
        this.seat_type = seat_type;
        this.cost = cost;
        this.theatreId = theatreId;
        this.locationId = locationId;
        this.movieId = movieId;
    }

    public Integer getSeatid() {
        return seatid;
    }

    public void setSeatid(Integer seatid) {
        this.seatid = seatid;
    }

    public String getSeat_type() {
        return seat_type;
    }

    public void setSeat_type(String seat_type) {
        this.seat_type = seat_type;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public Integer getTheatreId() {
        return theatreId;
    }

    public void setTheatreId(Integer theatreId) {
        this.theatreId = theatreId;
    }

    public Integer getLocationId() {
        return locationId;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }
}
