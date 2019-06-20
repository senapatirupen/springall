package com.exspring.demo.web.exception;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.exspring.demo.dto.ErrorDetail;

@ControllerAdvice
public class RestExceptionHandler {
	@ExceptionHandler(ResourceNotAvailableException.class)
	public ResponseEntity<?> handleResourceNotAvailableException(ResourceNotAvailableException rnae,
			HttpServletRequest request) {
		ErrorDetail error = new ErrorDetail();
		error.setTimeStamp(new Date().getTime());
		error.setStatus(HttpStatus.NOT_ACCEPTABLE.value());
		error.setTitle("Resoure Not Available");
		error.setDetail(rnae.getMessage());
		error.setDeveloperMessage(rnae.getClass().getName());
		return new ResponseEntity<>(error, null, HttpStatus.NOT_ACCEPTABLE);
	}
}
