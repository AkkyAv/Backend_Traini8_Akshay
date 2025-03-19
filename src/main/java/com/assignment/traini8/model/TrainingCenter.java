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

    @NotBlank
    @Size(max=39)
    private String centerName;

    @NotBlank
    @Pattern(regexp = "^[a-zA-Z0-9]{12}$")
    private String centerCode;

    @Embedded
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

