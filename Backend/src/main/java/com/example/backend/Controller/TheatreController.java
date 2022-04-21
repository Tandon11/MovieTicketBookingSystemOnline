package com.example.backend.Controller;

import com.example.backend.Model.Theatre;
import com.example.backend.Service.Theatre.TheatreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class TheatreController {

    @Autowired
    private TheatreService theatreService;

    @GetMapping("/theatre")
    public List<Theatre> list() {
        return theatreService.listAllTheatre();
    }

    @PostMapping("/theatre/add")
    public boolean add(@RequestBody Theatre theatre) {
        return theatreService.addTheatre(theatre);
    }
    @RequestMapping("/getTheatre/{locationid}/{movieid}")
	public List<Theatre> getAllTheatre(@PathVariable int locationid,@PathVariable int movieid)
	{
		List<Theatre> theatres=theatreService.findTheatreByMovieandLocation(locationid, movieid);
		return theatres;
	}
}
