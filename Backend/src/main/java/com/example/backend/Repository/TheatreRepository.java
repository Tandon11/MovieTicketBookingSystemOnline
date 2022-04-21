package com.example.backend.Repository;

import com.example.backend.Model.Theatre;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface TheatreRepository extends JpaRepository<Theatre, Integer> {
    @Query("select count(*) from Theatre where TheatreName  = ?1")
	int findCountOfTheatre(String name);
    @Query("select theatreId from Theatre where TheatreName = ?1")
    public int getTheatreId(String name);

  
    
    @Query("from Theatre where locationid=?1 and movieid =?2")
	public List<Theatre> findByMoviedandLocation(int locationid,int movieid);
    
}
