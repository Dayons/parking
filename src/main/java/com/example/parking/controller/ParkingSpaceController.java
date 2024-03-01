package com.example.parking.controller;

import com.example.parking.entity.ParkingSpace;
import com.example.parking.exceptions.ResourceNotFoundException;
import com.example.parking.repo.ParkingSpaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/parking-spaces")
public class ParkingSpaceController {

    @Autowired
    private ParkingSpaceRepository parkingSpaceRepository;

    @GetMapping
    public List<ParkingSpace> getAllParkingSpaces() {
        return parkingSpaceRepository.findAll();
    }

    @GetMapping("/{id}")
    public ParkingSpace getParkingSpaceById(@PathVariable Long id) {

    }

    @PostMapping
    public ParkingSpace createParkingSpace(@RequestBody ParkingSpace parkingSpace) {
        return parkingSpaceRepository.save(parkingSpace);
    }


    @DeleteMapping("/{id}")
    public void deleteParkingSpace(@PathVariable Long id) {
        parkingSpaceRepository.deleteById(id);
    }

}