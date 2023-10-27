package com.example.tour.service;
import com.example.tour.model.TourModel;
import com.example.tour.repository.TourRepository;
import com.example.tour.service.TourService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
@CrossOrigin(origins = "http://localhost:5500")
@Service
public class TourService {
    @Autowired
    private TourRepository tourRepository;

    public List<TourModel> saveScheduledMatches(List<TourModel> matches) {
        return tourRepository.saveAll(matches);
    }

    public List<TourModel> gettingAll(){
        return this.tourRepository.findAll();
    }
}