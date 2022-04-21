package com.example.backend.Service.Location;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.backend.Model.Location;
import com.example.backend.Repository.LocationRepository;
@Service
public class LocationService {
@Autowired
private LocationRepository locationRepository;
public List<Location> getAll()
{
	List<Location> locations=locationRepository.findAll();
	return locations;
}
}