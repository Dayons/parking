package com.example.parking.service;

import com.example.parking.entity.ParkingSpace;
import com.example.parking.enums.TypeOfParkingSpace;

import java.util.List;

public interface ParkingSpaceService {
    List<ParkingSpace> getAll();
    List<ParkingSpace> getParkingSpotsByType(TypeOfParkingSpace type);

    ParkingSpace reserveParkingSpace();
    }



