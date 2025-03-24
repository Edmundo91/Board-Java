package com.Board_Java.exceptions;

public class CardBlockedException extends RuntimeException {

    private static final long serialVersionUID = 1L;

	public CardBlockedException(String message) {
        super(message);
    }

}