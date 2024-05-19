package com.rodrigoolive.workshopmongo.resources.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.rodrigoolive.workshopmongo.services.exception.ObjectNotFoundExcption;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ResourceExceptionHandler {
	
	@ExceptionHandler(ObjectNotFoundExcption.class)
	public ResponseEntity<StandardError> objectNotFound(ObjectNotFoundExcption e, HttpServletRequest request){
		
		HttpStatus status = HttpStatus.NOT_FOUND;
		StandardError standardError = new StandardError(System.currentTimeMillis(), status.value(), "not found:", 
				e.getMessage(), request.getRequestURI());
		return ResponseEntity.status(status).body(standardError);
	}
}
