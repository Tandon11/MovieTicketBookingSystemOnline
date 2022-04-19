package com.example.backend.Service.Show;

import com.example.backend.Model.Booking;
import com.example.backend.Model.Shows;

import java.util.List;

public interface ShowService {
    public List<Shows> listAllShows();
    public boolean addShow(Shows show);
    public List<Shows> showsById(Integer locationid);
    public void updateShow(Booking booking);
    public void rollbackShow(String showid);
}