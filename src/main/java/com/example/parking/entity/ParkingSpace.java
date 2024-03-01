package com.example.parking.entity;

import com.example.parking.enums.Status;
import com.example.parking.enums.TypeOfParkingSpace;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "parking_space")
@Data
public class ParkingSpace {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Status isBusy;
    private TypeOfParkingSpace type;
}

