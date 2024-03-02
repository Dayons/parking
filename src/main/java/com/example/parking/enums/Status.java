package com.example.parking.enums;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public enum Status {
    AVAILABLE("Свободно"),
    RESERVED("Занято");

    String DESCRIPTION;
}
