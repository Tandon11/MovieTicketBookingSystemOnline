package com.example.backend.Service.Theatre;

import com.example.backend.Model.Theatre;

import java.util.List;

public interface TheatreService {
    public List<Theatre> listAllTheatre();
    public boolean addTheatre(Theatre theatre);
    public void addShow(Integer theatreid);
}
