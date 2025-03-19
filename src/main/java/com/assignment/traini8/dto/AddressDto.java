package com.assignment.traini8.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddressDto {
    @NotBlank(message = "Detailed address is required")
    @NotNull(message = "Detailed address is required")
    private String detailedAddress;

    @NotBlank(message = "City is required")
    @NotNull(message = "City is required")
    private String city;

    @NotBlank(message = "State is required")
    @NotNull(message = "State is required")
    private String state;

    @NotBlank(message = "Pincode is required")
    @NotNull(message = "Pincode is required")
    private String pincode;
}