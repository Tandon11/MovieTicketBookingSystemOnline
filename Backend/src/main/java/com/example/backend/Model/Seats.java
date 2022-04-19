package com.example.backend.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Seats {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer seatid;
    private String seat_type;
    private String cost;

    public Seats() {
    }

    public Seats(Integer seatid, String seat_type, String cost) {
        this.seatid = seatid;
        this.seat_type = seat_type;
        this.cost = cost;
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
}
