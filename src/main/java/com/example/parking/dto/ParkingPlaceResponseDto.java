package com.example.parking.dto;

import com.example.parking.enums.ParkingType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ParkingPlaceResponseDto {
    private String parkingNumber;
    private ParkingType parkingType;
    private boolean isOccupied;
}
