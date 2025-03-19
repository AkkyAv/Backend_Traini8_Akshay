package com.assignment.traini8.service;

import com.assignment.traini8.dto.AddressDto;
import com.assignment.traini8.dto.TrainingCenterRequest;
import com.assignment.traini8.model.Address;
import com.assignment.traini8.model.TrainingCenter;
import com.assignment.traini8.repository.TrainingCenterRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;

@Service
@Transactional
public class TrainingCenterService {

    private final TrainingCenterRepo trainingCenterRepo;

    public TrainingCenterService(TrainingCenterRepo trainingCenterRepo){
        this.trainingCenterRepo = trainingCenterRepo;
    }

    public TrainingCenter createTrainingCenter(TrainingCenterRequest request){
        Address address = convertToAddress(request.getAddress());
        TrainingCenter trainingCenter = new TrainingCenter();
        trainingCenter.setCenterName(request.getCenterName());
        trainingCenter.setCenterCode(request.getCenterCode());
        trainingCenter.setAddress(address);
        trainingCenter.setStudentCapacity(request.getStudentCapacity());
        trainingCenter.setCoursesOffered(request.getCoursesOffered());
        trainingCenter.setContactPhone(request.getContactPhone());
        trainingCenter.setContactEmail(request.getContactEmail());
        trainingCenter.setCreatedOn(Instant.now());

        return trainingCenterRepo.save(trainingCenter);
    }

    private Address convertToAddress(AddressDto addressDto) {
        // Map the fields from AddressDto to Address entity
        Address address = new Address();
        address.setDetailedAddress(addressDto.getDetailedAddress());
        address.setCity(addressDto.getCity());
        address.setState(addressDto.getState());
        address.setPincode(addressDto.getPincode());
        return address;
    }

    public List<TrainingCenter> getAllTrainingCenters() {

        return trainingCenterRepo.findAll();
    }
}
