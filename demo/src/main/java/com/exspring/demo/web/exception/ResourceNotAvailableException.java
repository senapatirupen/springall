package com.exspring.demo.web.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
public class ResourceNotAvailableException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ResourceNotAvailableException() {

	}

	public ResourceNotAvailableException(String message) {
		super(message);
	}

	public ResourceNotAvailableException(String message, Throwable cause) {
		super(message, cause);
	}
}