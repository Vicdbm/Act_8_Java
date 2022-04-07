package com.company;

public class NoHandAvailableException extends Exception {
    public NoHandAvailableException() {
        super("No hay suficientes cartas, elige otra opción");
    }

    public NoHandAvailableException(String message) {
        super(message);
    }
}