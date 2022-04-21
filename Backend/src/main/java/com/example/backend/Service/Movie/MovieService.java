package com.example.backend.Service.Movie;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.backend.Model.Movie;

import com.example.backend.Repository.MovieRepository;

@Service
public class MovieService {
@Autowired
private MovieRepository movieRepository;
public List<Movie> getAll()
{
	List<Movie> movies=movieRepository.findAll();
	return movies;
}
}
