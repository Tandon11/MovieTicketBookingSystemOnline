package com.example.backend.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Shows {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String showid;
    private Integer locationid;
    private String showno;
    private Integer status = 0;
    private String time = "0";
    private Integer duration = 0;

    public Shows() {
    }

    public Shows(String showid, Integer locationid, String showno, Integer status, String time, Integer duration) {
        this.showid = showid;
        this.locationid = locationid;
        this.showno = showno;
        this.status = status;
        this.time = time;
        this.duration = duration;
    }

    public String getShowid() {
        return showid;
    }

    public void setShowid(String showid) {
        this.showid = showid;
    }

    public Integer getLocationid() {
        return locationid;
    }

    public void setLocationid(Integer locationid) {
        this.locationid = locationid;
    }

    public String getShowno() {
        return showno;
    }

    public void setShowno(String showno) {
        this.showno = showno;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }
}
