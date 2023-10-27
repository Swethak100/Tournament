package com.example.tour.repository;


import com.example.tour.model.TourModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:5500")
public interface TourRepository extends JpaRepository<TourModel,Integer> {
}
