package com.metrorail.fare.ticketFare.exception;

public class FareException extends Exception {
    public FareException() {
        super();
    }

    public FareException(Exception e) {
        super(e);
    }

    public FareException(String message) {
        super(message);
    }
}