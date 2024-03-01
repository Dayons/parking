package com.example.parking.enums;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public enum Status {
    EMPTY("Свободно"),
    BUSY("Зянато");

    String DESCRIPTION;
}
