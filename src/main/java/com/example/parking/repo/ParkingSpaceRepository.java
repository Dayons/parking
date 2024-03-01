package com.example.parking.repo;

import com.example.parking.entity.ParkingSpace;
import com.example.parking.enums.TypeOfParkingSpace;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ParkingSpaceRepository extends JpaRepository<ParkingSpace, Long> {
    List<ParkingSpace> findAll();

    List<ParkingSpace> findByType(TypeOfParkingSpace type);
    List<ParkingSpace> findByStatus(String status);

}

