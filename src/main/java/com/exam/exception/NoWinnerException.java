package com.exam.exception;

public class NoWinnerException extends Exception {
    public NoWinnerException() {
        super("Nessun vincitore trovato");
    }
}
