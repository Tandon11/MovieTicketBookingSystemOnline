package com.example.backend.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "theatredetails")
public class Theatre {

    @Id
	

	private int theatreId;
	
	
	private int locationId;
	
	@Column(name = "TheatreName")
	private String theatreName;
	
	
	private int MovieID;
	public Theatre() {
		super();
	}
	
	public Theatre(int theatreId, int locationId, String theatreName,int MovieID) {
		super();
		this.theatreId = theatreId;
		this.locationId = locationId;
		this.theatreName = theatreName;
		this.MovieID=MovieID;
	}

	public int getTheatreId() {
		return theatreId;
	}

	public void setTheatreId(int theatreId) {
		this.theatreId = theatreId;
	}

	public int getLocationId() {
		return locationId;
	}

	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}

	public String getTheatreName() {
		return theatreName;
	}

	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMovieID() {
		return MovieID;
	}

	public void setMovieID(int movieID) {
		MovieID = movieID;
	}
	

}