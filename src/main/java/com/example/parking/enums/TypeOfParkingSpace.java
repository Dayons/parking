package com.example.parking.enums;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)

public enum TypeOfParkingSpace {
    STANDART("Стандартный"),
    THEDISABLED("Для инвалидов"),
    FAMILIESWITHCHILDREN("для семей с детьми"),
    ELECTRICVECHICLES("Электромобили");

    String DESCRIPTION;

}
