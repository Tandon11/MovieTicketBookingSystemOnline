package com.example.backend.Repository;

import com.example.backend.Model.Theatre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface TheatreRepository extends JpaRepository<Theatre, Integer> {
    @Query("select 'count(*)' from Theatre where theatre_name = ?1")
    int findCountOfTheatre(String name);

    @Query("select theatreid from Theatre where theatre_name = ?1")
    int getTheatreId(String name);

    @Modifying
    @Transactional
    @Query("update Theatre t set t.shows = t.shows+1 where t.theatreid = ?1")
    int updateShow(Integer theatreid);
}
