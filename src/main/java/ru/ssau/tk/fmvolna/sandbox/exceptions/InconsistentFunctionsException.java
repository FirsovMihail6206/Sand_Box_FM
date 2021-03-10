package ru.ssau.tk.fmvolna.sandbox.exceptions;

import java.io.Serializable;

public class InconsistentFunctionsException extends RuntimeException implements Serializable {
    private static final long serialVersionUID = -7954248414542844377L;

    public InconsistentFunctionsException() {
    }

    public InconsistentFunctionsException(String message) {
        super(message);
    }
}
