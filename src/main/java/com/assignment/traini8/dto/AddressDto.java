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
    @NotBlank
    @NotNull
    private String detailedAddress;

    @NotBlank
    @NotNull
    private String city;

    @NotBlank
    @NotNull
    private String state;

    @NotBlank
    @NotNull
    private String pincode;
}