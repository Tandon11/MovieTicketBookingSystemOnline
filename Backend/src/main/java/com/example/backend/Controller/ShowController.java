package com.example.backend.Controller;

import com.example.backend.Model.Shows;
import com.example.backend.Service.Show.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class ShowController {

    @Autowired
    private ShowService showService;

    @GetMapping("/shows")
    public List<Shows> listAll(){
        return showService.listAllShows();
    }

    @GetMapping("/shows/getbyid/{locationid}")
    public List<Shows> showById(@PathVariable Integer locationid){
        return showService.showsById(locationid);

    }
    @PostMapping("/shows/add")
    public boolean add(@RequestBody Shows show) {
        return showService.addShow(show);
    }
}
