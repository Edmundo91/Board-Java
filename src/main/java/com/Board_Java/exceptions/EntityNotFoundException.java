package com.Board_Java.exceptions;

public class EntityNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;

	public EntityNotFoundException(String message) {
        super(message);
    }

}