package com.Board_Java.persistence.entity;

import java.util.stream.Stream;

import com.Board_Java.exceptions.EntityNotFoundException;

public enum BoardColumnKindEnum {

    INITIAL, FINAL, CANCEL, PENDING;

    public static BoardColumnKindEnum findByName(final String name){
        return Stream.of(BoardColumnKindEnum.values())
                .filter(b -> b.name().equals(name))
                .findFirst().orElseThrow(() -> new EntityNotFoundException("No BoardColumnKindEnum constant for name: " + name));
    }

}
