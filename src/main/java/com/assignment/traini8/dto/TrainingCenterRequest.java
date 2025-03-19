package com.assignment.traini8.dto;

import jakarta.persistence.Embedded;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
public class TrainingCenterRequest {

    @Valid


    @NotNull(message = "Center name cannot be null")
    @NotBlank(message="Center name cannot be blank")
    @Size(max=39, message = "Center name should be less than 40 characters")
    private String centerName;

    @NotNull(message = "Center code cannot be null")
    @NotBlank(message="Center code cannot be blank")
    @Pattern(regexp = "^[a-zA-Z0-9]*$", message = "Username must be alphanumeric")
    @Size(min = 12, max = 12, message = "Center code should be 12 characters")
    private String centerCode;

    @Embedded
    private AddressDto address;

    private Integer studentCapacity;
    private List<String> coursesOffered;
    @NotNull
    @NotBlank
    @Pattern(regexp = "^\\d{10}$", message = "Phone number must be exactly 10 digits")
    private String contactPhone;

    @Email(message =  "Invalid email address format")
    private String contactEmail;

}


