package com.example.backend.Repository;

import com.example.backend.Model.Booking;
import com.example.backend.Model.Shows;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface ShowRepository extends JpaRepository<Shows, Integer> {

    @Query("select s from Shows s where s.theatreId = ?1 and s.movieId=?2")
    List<Shows> showByMovieandLocationId(Integer locationid,Integer MovieId);

   // @Modifying
  //  @Transactional
  //  @Query("update Shows s set s.status = ?1, s.time = ?2, s.duration = ?3 where s.showid = ?4")
  //  int updateShow(Integer status, String time, Integer duration, String showid);

   // @Modifying
 //   @Transactional
 //   @Query("update Shows s set s.status = 0, s.time = 0, s.duration = 0 where s.showid = ?1")
 //   int rollbackShow(String showid);

    Boolean existsById(int showid);

}
