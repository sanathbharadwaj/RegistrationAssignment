package com.nissan.training.advancedjava.servlet;

public class InvalidFieldException extends Exception {

	String message;
	public InvalidFieldException(String message) {
		super(message);
        this.message = message;
	}
	
	@Override
    public String toString() {
        return message;
    }
}
