package com.luv2code.springdemo.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomerRestExceptionHandler {

	//ADD AN EXCEPTION HANDLER OFR CUSTOMERNORFOUNDEXCEPTION
	@ExceptionHandler
	public ResponseEntity<CustomerErrorResponse> handleException(CustomerNotFoundException exc) {
		
		//CREATE CUSTOMERERRORREPONSE
		CustomerErrorResponse error = new CustomerErrorResponse(
				HttpStatus.NOT_FOUND.value(),
				exc.getMessage(),
				System.currentTimeMillis()
				);
		
		//RETURN RESPONSEENTITY
		
		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
	}
	
	//ADD EXCEPTION HANDLER FOR ANY EXCEPTION - GENERIC
	
	
	
}
