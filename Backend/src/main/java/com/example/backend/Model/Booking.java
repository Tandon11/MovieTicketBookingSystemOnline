package com.example.backend.Model;

import javax.persistence.*;
import javax.websocket.OnError;

@Entity
public class Booking {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookingId;
	private String email;
	private int MovieId;
	private int LocationId;
	private int TheatreId;
	private int ShowId;
	private String seatId;
	private int Count;

	public Booking() {

	}

	public Booking(String email, int movieId, int locationId, int theatreId, int showId, String seatId, int count) {
		this.email = email;
		MovieId = movieId;
		LocationId = locationId;
		TheatreId = theatreId;
		ShowId = showId;
		this.seatId = seatId;
		Count = count;
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

	public int getMovieId() {
		return MovieId;
	}

	public void setMovieId(int movieId) {
		MovieId = movieId;
	}

	public int getLocationId() {
		return LocationId;
	}

	public void setLocationId(int locationId) {
		LocationId = locationId;
	}

	public int getTheatreId() {
		return TheatreId;
	}

	public void setTheatreId(int theatreId) {
		TheatreId = theatreId;
	}

	public int getShowId() {
		return ShowId;
	}

	public void setShowId(int showId) {
		ShowId = showId;
	}

	public String getSeatId() {
		return seatId;
	}

	public void setSeatId(String seatId) {
		this.seatId = seatId;
	}

	public int getCount() {
		return Count;
	}

	public void setCount(int count) {
		Count = count;
	}
}
