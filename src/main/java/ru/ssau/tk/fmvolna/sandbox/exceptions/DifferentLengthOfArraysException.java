package ru.ssau.tk.fmvolna.sandbox.exceptions;

import java.io.Serializable;

public class DifferentLengthOfArraysException extends RuntimeException implements Serializable {
    private static final long serialVersionUID = -2394204190654402716L;

    public DifferentLengthOfArraysException() {
    }

    public DifferentLengthOfArraysException(String message) {
        super(message);
    }
}