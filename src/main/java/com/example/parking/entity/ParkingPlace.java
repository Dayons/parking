package com.example.parking.entity;

import com.example.parking.enums.ParkingType;
import com.example.parking.enums.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "parking_places")
public class ParkingPlace {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String parkingNumber;
    private ParkingType parkingType;
    private Status status;
    private boolean isOccupied;

    @ManyToOne
    @JoinColumn(name = "gate_number")
    private User user;

}
