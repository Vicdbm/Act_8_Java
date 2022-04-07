package com.company;

public class InvalidOptionException extends Exception {
    public InvalidOptionException() {
        super("Opción no valida, elige un número entre 0 y 4");
    }

    public InvalidOptionException(String message) {
        super(message);
    }
}
