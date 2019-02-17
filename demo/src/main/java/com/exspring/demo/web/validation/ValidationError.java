package com.exspring.demo.web.validation;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

public class ValidationError {

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	private List<String> errors = new ArrayList<>();
	private final String errorMessage;

	public ValidationError(String message) {
		this.errorMessage = message;
	}

	public void addValidationError(String error) {
		errors.add(error);
	}

	public List<String> getErrors() {
		return errors;
	}

	public String getErrorMessage() {
		return errorMessage;
	}
}
