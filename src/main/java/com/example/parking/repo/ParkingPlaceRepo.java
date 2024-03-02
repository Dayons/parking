package com.example.parking.repo;

import com.example.parking.entity.ParkingPlace;
import com.example.parking.enums.ParkingType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface ParkingPlaceRepo extends JpaRepository<ParkingPlace, Long> {
    List<ParkingPlace> findByType(ParkingType type);

    @Query("SELECT p FROM ParkingPlace p WHERE p.isOccupied = false")
    List<ParkingPlace> findFreeParkingPlaces();

    @Query("SELECT p FROM ParkingPlace p WHERE p.parkingNumber = :parkingNumber")
    List<ParkingPlace> findByParkingNumber(@Param("parkingNumber") String parkingNumber);
}
