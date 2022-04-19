package com.example.backend.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Theatre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer theatreid;
    private String theatre_name;
    private Integer shows = 0;
    private String area;
    private String cast;
    private String bannerimage;

    public Theatre() {
    }

    public Theatre(Integer theatreid, String theatre_name, Integer shows, String area, String cast, String bannerimage) {
        this.theatreid = theatreid;
        this.theatre_name = theatre_name;
        this.shows = shows;
        this.area = area;
        this.cast = cast;
        this.bannerimage = bannerimage;
    }

    public Integer getTheatreid() {
        return theatreid;
    }

    public void setTheatreid(Integer theatreid) {
        this.theatreid = theatreid;
    }

    public String getTheatre_name() {
        return theatre_name;
    }

    public void setTheatre_name(String theatre_name) {
        this.theatre_name = theatre_name;
    }

    public Integer getShows() {
        return shows;
    }

    public void setShows(Integer shows) {
        this.shows = shows;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCast() {
        return cast;
    }

    public void setCast(String cast) {
        this.cast = cast;
    }

    public String getBannerimage() {
        return bannerimage;
    }

    public void setBannerimage(String bannerimage) {
        this.bannerimage = bannerimage;
    }
}
