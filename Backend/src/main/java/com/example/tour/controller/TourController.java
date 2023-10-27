package com.example.tour.controller;

import com.example.tour.model.TourModel;
import com.example.tour.service.TourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://127.0.0.1:5500")
@RestController
@RequestMapping("/tour")
public class TourController {
    @Autowired
    private TourService tourService;
    @GetMapping
    public List<TourModel> getAllController() {
        return tourService.gettingAll();
    }
    @PostMapping("/tour")
    public void saveScheduledMatches(@RequestBody List<TourModel> matches) {
        tourService.saveScheduledMatches(matches);
System.out.println("ok saved");
    }
    @PostMapping
    public ResponseEntity<String> saveMatches(@RequestBody List<TourModel> matches) {
        // Process and store the matches in the database or perform any other desired actions.
        // You can use the 'matches' list to access team names and scheduled dates.

        return ResponseEntity.ok("Matches saved successfully");
    }
}

