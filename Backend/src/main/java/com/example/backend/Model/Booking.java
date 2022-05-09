package com.example.backend.Model;

import javax.persistence.*;
import javax.websocket.OnError;

@Entity
public class Booking {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookingId;
	private String email;
	private Integer MovieId;
	private Integer LocationId;
	private Integer TheatreId;
	private Integer ShowId;
	//@Column(columnDefinition = "integer[]")
	//private Integer[] SeatId;
	private Integer Count;
	private Integer amount;

	public Booking(int bookingId, String email, Integer movieId, Integer locationId, Integer theatreId, Integer showId, Integer count, Integer amount) {
		this.bookingId = bookingId;
		this.email = email;
		MovieId = movieId;
		LocationId = locationId;
		TheatreId = theatreId;
		ShowId = showId;
		Count = count;
		this.amount = amount;
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getMovieId() {
		return MovieId;
	}

	public void setMovieId(Integer movieId) {
		MovieId = movieId;
	}

	public Integer getLocationId() {
		return LocationId;
	}

	public void setLocationId(Integer locationId) {
		LocationId = locationId;
	}

	public Integer getTheatreId() {
		return TheatreId;
	}

	public void setTheatreId(Integer theatreId) {
		TheatreId = theatreId;
	}

	public Integer getShowId() {
		return ShowId;
	}

	public void setShowId(Integer showId) {
		ShowId = showId;
	}

	public Integer getCount() {
		return Count;
	}

	public void setCount(Integer count) {
		Count = count;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}
}
