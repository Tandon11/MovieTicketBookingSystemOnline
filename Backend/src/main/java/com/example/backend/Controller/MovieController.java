package com.example.backend.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.Service.Movie.MovieService;
import com.example.backend.Model.Movie;


@RestController

@EnableAutoConfiguration

public class MovieController {
	@Autowired
	private MovieService movieService;
	@RequestMapping("/getAllMovies")
	public List<Movie> getAllLocation()
	{
		List<Movie> locations=movieService.getAll();
		return locations;
	}

}

