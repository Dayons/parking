package com.example.parking.service;

import com.example.parking.dto.ParkingPlaceResponseDto;
import com.example.parking.dto.ParkingPlaceSaveDto;
import com.example.parking.enums.ParkingType;

import java.util.List;

public interface ParkingPlaceService {
    ParkingPlaceResponseDto create(ParkingPlaceResponseDto parkingPlaceResponseDto);

    public List<ParkingPlaceSaveDto> getAllParkingPlaces();
    List<ParkingPlaceSaveDto> findAllFreePlaces();
    public ParkingPlaceSaveDto getParkingPlaceById(Long id);
    List<ParkingPlaceSaveDto> findFreePlacesByParkingType(ParkingType parkingType);
    void delete(Long id);
}
