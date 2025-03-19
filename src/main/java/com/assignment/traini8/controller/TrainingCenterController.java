package com.assignment.traini8.controller;


import com.assignment.traini8.dto.AddressDto;
import com.assignment.traini8.dto.TrainingCenterRequest;
import com.assignment.traini8.model.TrainingCenter;
import com.assignment.traini8.service.TrainingCenterService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
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
        TrainingCenter createdTrainingCenter = trainingCenterService.createTrainingCenter(request);

        return ResponseEntity.status(HttpStatus.CREATED).body(createdTrainingCenter);
    }




    //SECOND API
    @GetMapping
    public ResponseEntity<List<TrainingCenter>> getAllTrainingCenters(
            //if user wants to filter by city or state
            @RequestParam(required = false) String city,
            @RequestParam(required = false) String state
    )
    {
        return ResponseEntity.ok(service.getAllTrainingCenters());
    }
}
