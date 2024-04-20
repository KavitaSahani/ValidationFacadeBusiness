package com.Validation_facade_Business.Exceptions;

import java.util.List;

public class ValidationException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	private List<String> errors;

	public ValidationException(String message) {
		super(message);
	}

	public ValidationException(String message, Throwable cause) {
		super(message, cause);
	}

	public ValidationException(List<String> errors) {
		super("Validation failed with multiple errors.");
		this.errors = errors;
	}

	public List<String> getErrors() {
		return errors;
	}
}
