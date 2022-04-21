package com.example.backend.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.backend.Model.Location;
public interface LocationRepository extends JpaRepository<Location, Integer>{

}
