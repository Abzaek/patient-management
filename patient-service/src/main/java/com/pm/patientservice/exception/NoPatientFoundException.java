package com.pm.patientservice.exception;

public class NoPatientFoundException extends RuntimeException {
    public NoPatientFoundException(String message) {
        super(message);
    }
}
