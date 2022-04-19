package com.example.backend.Service.Theatre;

import com.example.backend.Model.Theatre;
import com.example.backend.Repository.TheatreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TheatreServiceImpl implements TheatreService {

    @Autowired
    private TheatreRepository theatreRepository;

    public List<Theatre> listAllTheatre() {
        return theatreRepository.findAll();
    }

    public boolean addTheatre(Theatre theatre) {
        Integer count = theatreRepository.findCountOfTheatre(theatre.getTheatre_name());
        if(count > 0)
            return false;
        else {
            theatreRepository.save(theatre);
            return true;
        }
    }

    public void addShow(Integer theatreid) {
        theatreRepository.updateShow(theatreid);
    }
}
