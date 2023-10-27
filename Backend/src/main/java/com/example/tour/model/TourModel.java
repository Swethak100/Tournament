package com.example.tour.model;

import jakarta.persistence.*;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Date;

@Entity
@CrossOrigin(origins = "http://localhost:5500")
@Table(name = "tournament4")
public class TourModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String teamName;
    private Date scheduledDate;

    public TourModel() {
    }

    public TourModel(int id,String teamName, Date scheduledDate) {
        this.id=id;
        this.teamName = teamName;
        this.scheduledDate = scheduledDate;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Date getScheduledDate() {
        return scheduledDate;
    }

    public void setScheduledDate(Date scheduledDate) {
        this.scheduledDate = scheduledDate;
    }
}
