package com.example.backend.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.Model.Location;

import com.example.backend.Service.Location.LocationService;




@RestController

@EnableAutoConfiguration
@CrossOrigin("*")
public class LocationController {
	@Autowired
	private LocationService locationService;
	@RequestMapping("/getAllLocation")
	public List<Location> getAllLocation()
	{
		List<Location> locations=locationService.getAll();
		return locations;
	}

}
