package com.example.backend.DTO;

public class BookingObject {
private String email;
private Integer MovieId;
private Integer LocationId;
private Integer TheatreId;
private Integer ShowId;
private Integer[] SeatId;
private Integer Count;
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

public Integer[] getSeatId() {
	return SeatId;
}
public Integer getCount() {
	return Count;
}
public void setCount(Integer count) {
	Count = count;
}
public void setSeatId(Integer[] seatId) {
	SeatId = seatId;
}
public BookingObject(String email, Integer movieId, Integer locationId, Integer theatreId, Integer showId,
		Integer[] seatId, Integer count) {
	super();
	this.email = email;
	MovieId = movieId;
	LocationId = locationId;
	TheatreId = theatreId;
	ShowId = showId;
	SeatId = seatId;
	Count = count;
}


}
