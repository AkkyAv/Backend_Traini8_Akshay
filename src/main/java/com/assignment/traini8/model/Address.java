package com.assignment.traini8.model;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    @NotBlank
    private String detailedAddress;
    @NotBlank
    private String city;
    @NotBlank
    private String state;
    @NotBlank
    private String pincode;
}