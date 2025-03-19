package com.assignment.traini8.controller;


import com.assignment.traini8.dto.AddressDto;
import com.assignment.traini8.dto.TrainingCenterRequest;
import com.assignment.traini8.model.TrainingCenter;
import com.assignment.traini8.service.TrainingCenterService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.assignment.traini8.model.Address;
import jakarta.validation.Valid;

import java.time.Instant;
import java.util.List;

@RestController
@RequestMapping("/api/training-center")
@RequiredArgsConstructor
public class TrainingCenterController {

    private final TrainingCenterService trainingCenterService;

    private final TrainingCenterService service;

    //FIRST API
    @PostMapping
    public ResponseEntity<TrainingCenter> createTrainingCenter(@Valid @RequestBody TrainingCenterRequest request) {

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
        return ResponseEntity.ok(trainingCenterService.createTrainingCenter(trainingCenter));
    }

    // Converting AddressDto to Address entity
    private Address convertToAddress(AddressDto addressDto) {
        // Map the fields from AddressDto to Address entity
        Address address = new Address();
        address.setDetailedAddress(addressDto.getDetailedAddress());
        address.setCity(addressDto.getCity());
        address.setState(addressDto.getState());
        address.setPincode(addressDto.getPincode());
        return address;
    }

    //SECOND API
    @GetMapping
    public ResponseEntity<List<TrainingCenter>> getAllTrainingCenters(
            //if user wants to filter by city or state
            @RequestParam(required = false) String city,
            @RequestParam(required = false) String state
    ) {
        return ResponseEntity.ok(service.getAllTrainingCenters());
    }
}
