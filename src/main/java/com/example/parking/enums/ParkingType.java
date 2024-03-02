package com.example.parking.enums;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public enum ParkingType {
    STANDARD("Стандартный"),
    FOR_DISABLED("Для инвалидов"),
    FAMILIES("Для семей с детьми"),
    ELECTRIC_CARS("Для электромобилей");

    String DESCRIPTION;
}
