package com.example.backend.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "moviedetails")
public class Movie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int movieId;
	@Column(name="movieName")
	private String movieName;
	@Column(name="Genre")
	private String Genre;
	@Column(name="Summary")
	private String Summary;
	@Column(name="Review")
	private String Review;
	public Movie() {
		super();
	}

	
	
	public Movie(String movieName, String genre, String summary, String review) {
		super();
		this.movieName = movieName;
		Genre = genre;
		Summary = summary;
		Review = review;
	}



	public String getSummary() {
		return Summary;
	}



	public void setSummary(String summary) {
		Summary = summary;
	}



	public String getReview() {
		return Review;
	}



	public void setReview(String review) {
		Review = review;
	}



	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getGenre() {
		return Genre;
	}

	public void setGenre(String genre) {
		Genre = genre;
	}
	
}