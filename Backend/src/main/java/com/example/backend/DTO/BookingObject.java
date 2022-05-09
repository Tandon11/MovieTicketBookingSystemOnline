package com.example.backend.DTO;

public class BookingObject {
	private String email;
	private int MovieId;
	private int LocationId;
	private int TheatreId;
	private int ShowId;
	private String seatId;
	private int Count;
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

public String getSeatId() {
	return seatId;
}
public Integer getCount() {
	return Count;
}
public void setCount(Integer count) {
	Count = count;
}
public void setSeatId(String seatId) {
	seatId = seatId;
}
public BookingObject(String email, Integer movieId, Integer locationId, Integer theatreId, Integer showId,
		String seatId, Integer count) {
	super();
	this.email = email;
	MovieId = movieId;
	LocationId = locationId;
	TheatreId = theatreId;
	ShowId = showId;
	seatId = seatId;
	Count = count;
}


}
