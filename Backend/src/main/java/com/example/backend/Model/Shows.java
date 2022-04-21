package com.example.backend.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Shows {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer showid;
    private Integer theatreId;
    private Integer movieId;
    
    private String date;
    private String time;
    private Integer duration = 0;
    
    public Shows() {
    }
	public Shows(Integer showid, Integer theatreId, Integer movieId, String date, String time, Integer duration
			) {
		super();
		this.showid = showid;
		this.theatreId = theatreId;
		this.movieId = movieId;
		this.date=date;		
		this.time = time;
		this.duration = duration;
			}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Integer getShowid() {
		return showid;
	}
	public void setShowid(Integer showid) {
		this.showid = showid;
	}
	public Integer getTheatreId() {
		return theatreId;
	}
	public void setTheatreId(Integer theatreId) {
		this.theatreId = theatreId;
	}
	public Integer getMovieId() {
		return movieId;
	}
	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}
	
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public Integer getDuration() {
		return duration;
	}
	public void setDuration(Integer duration) {
		this.duration = duration;
	}

    
}

   