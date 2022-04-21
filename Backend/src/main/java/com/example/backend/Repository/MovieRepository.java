package com.example.backend.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.backend.Model.Movie;

public interface MovieRepository extends JpaRepository<Movie, Integer>{

}