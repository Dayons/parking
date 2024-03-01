package com.example.parking.service.impl;

import com.example.parking.entity.ParkingSpace;
import com.example.parking.enums.TypeOfParkingSpace;
import com.example.parking.repo.ParkingSpaceRepository;
import com.example.parking.service.ParkingSpaceService;
import lombok.RequiredArgsConstructor;

import java.util.List;
@RequiredArgsConstructor
public class ParkingSpaceImpl implements ParkingSpaceService {
    private final ParkingSpaceRepository parkingSpaceRepository;
    @Override
    public List<ParkingSpace> getAll() {
        return parkingSpaceRepository.findAll();
    }

    @Override
    public List<ParkingSpace> getParkingSpotsByType(TypeOfParkingSpace type) {
        return null;
    }

    @Override
    public ParkingSpace reserveParkingSpace() {
        return null;
    }
}
