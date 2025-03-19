package com.assignment.traini8.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.List;

@Entity
@Data
public class TrainingCenter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Center Name is required")
    @NotNull(message = "Center Name is required")
    @Size(max=39)
    private String centerName;

    @NotBlank(message = "Center Code is required")
    @Pattern(regexp = "^[a-zA-Z0-9]{12}$", message = "Center Code must be 12 characters long")
    private String centerCode;

    @Embedded
    @NotNull(message = "Address is required")
    @NotBlank(message = "Address is required")
    private Address address;


    private Integer studentCapacity;

    private Instant createdOn = Instant.now();

    @ElementCollection
    private List<String> coursesOffered;

    @NotBlank
    @NotNull
    @Pattern(regexp = "^\\d{10}$")
    private String contactPhone;

    @Email
    private String contactEmail;

}

