package com.exspring.demo.web.exception;

<<<<<<< HEAD
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.exspring.demo.dto.ErrorDetail;
import com.exspring.demo.dto.ValidationError;

@ControllerAdvice
public class RestExceptionHandler {
	
	@Inject
	private MessageSource messageSource;
	
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

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<?> handleValidationError(MethodArgumentNotValidException manve, HttpServletRequest request) {
		ErrorDetail error = new ErrorDetail();
		error.setTimeStamp(new Date().getTime());
		error.setStatus(HttpStatus.BAD_REQUEST.value());
		error.setTitle("Validation Failed");
		error.setDetail("Input validation failed");
		error.setDeveloperMessage(manve.getClass().getName());
		String requestPath = (String) request.getAttribute("javax.servlet.error.request_uri");
		if (requestPath == null) {
			requestPath = request.getRequestURI();
		}
		// create validationError instance
		List<FieldError> fieldErrors = manve.getBindingResult().getFieldErrors();
		for (FieldError fe : fieldErrors) {
			List<ValidationError> validationErrorList = error.getErrors().get(fe.getField());
			if (validationErrorList == null) {
				validationErrorList = new ArrayList<ValidationError>();
				error.getErrors().put(fe.getField(), validationErrorList);
			}
			ValidationError validationError = new ValidationError();
			validationError.setCode(fe.getCode());
			validationError.setMessage(messageSource.getMessage(fe, null));
			validationErrorList.add(validationError);
		}
		return new ResponseEntity<>(error, null, HttpStatus.BAD_REQUEST);
=======
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
>>>>>>> branch 'master' of https://github.com/senapatirupen/springall.git
	}
}
