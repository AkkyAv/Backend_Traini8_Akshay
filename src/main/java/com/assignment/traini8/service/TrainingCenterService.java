package com.assignment.traini8.service;

import com.assignment.traini8.model.TrainingCenter;
import com.assignment.traini8.repository.TrainingCenterRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class TrainingCenterService {

    private final TrainingCenterRepo trainingCenterRepo;

    public TrainingCenterService(TrainingCenterRepo trainingCenterRepo){
        this.trainingCenterRepo = trainingCenterRepo;
    }
    public TrainingCenter createTrainingCenter(TrainingCenter trainingCenter){
        trainingCenter.setCreatedOn(java.time.Instant.now());
        return trainingCenterRepo.save(trainingCenter);
    }

    public List<TrainingCenter> getAllTrainingCenters() {
        return trainingCenterRepo.findAll();
    }
}
