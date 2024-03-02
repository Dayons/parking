package com.example.parking.service.impl;

import com.example.parking.dto.ParkingPlaceResponseDto;
import com.example.parking.dto.ParkingPlaceSaveDto;
import com.example.parking.entity.ParkingPlace;
import com.example.parking.enums.ParkingType;
import com.example.parking.enums.Status;
import com.example.parking.repo.ParkingPlaceRepo;
import com.example.parking.service.ParkingPlaceService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ParkingPlaceServiceImpl implements ParkingPlaceService {
private final ParkingPlaceRepo parkingPlaceRepo;
    @Override
    public ParkingPlaceResponseDto create(ParkingPlaceResponseDto parkingPlaceResponseDto) throws RuntimeException {
        try{ ParkingPlace parkingPlace = ParkingPlace.builder()
                .parkingNumber(parkingPlaceResponseDto.getParkingNumber())
                .parkingType(parkingPlaceResponseDto.getParkingType())
                .status(Status.AVAILABLE)
                .build();
            parkingPlaceRepo.save(parkingPlace);
        }catch (Exception e){
            throw new RuntimeException();
        }
        return parkingPlaceResponseDto;
    }

    @Override
    public List<ParkingPlaceSaveDto> getAllParkingPlaces() {
        List<ParkingPlace> parkingPlaceEntities = parkingPlaceRepo.findAll();

        List<ParkingPlaceSaveDto> parkingPlaceSaveDtos = new ArrayList<>();
        for(ParkingPlace parkingPlace : parkingPlaceEntities){
             ParkingPlaceSaveDto parkingPlaceDto = ParkingPlaceSaveDto.builder()
                    .id(parkingPlace.getId())
                    .parkingNumber(parkingPlace.getParkingNumber())
                    .parkingType(parkingPlace.getParkingType())
                    .build();
            parkingPlaceSaveDtos.add(parkingPlaceDto);
        }
        return parkingPlaceSaveDtos;
    }

    @Override
    public List<ParkingPlaceSaveDto> findAllFreePlaces() {
        return null;
    }

    @Override
    public ParkingPlaceSaveDto getParkingPlaceById(Long id) {
        ParkingPlace parkingPlaceEntity = parkingPlaceRepo.findById(id)
                .orElseThrow(()->new EntityNotFoundException("Parking place is not found"));

        return ParkingPlaceSaveDto.builder()
                .id(parkingPlaceEntity.getId())
                .parkingNumber(parkingPlaceEntity.getParkingNumber())
                .parkingType(parkingPlaceEntity.getParkingType())
                .build();
    }

    @Override
    public List<ParkingPlaceSaveDto> findFreePlacesByParkingType(ParkingType parkingType) {
        return null;
    }

    @Override
    public void delete(Long id) {
        parkingPlaceRepo.deleteById(id);
    }
}
