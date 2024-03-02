package com.example.parking.dto;

import com.example.parking.enums.ParkingType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Builder
public class ParkingPlaceSaveDto {
    private Long id;
    private String parkingNumber;
    private ParkingType parkingType;
    private boolean isOccupied;
}
