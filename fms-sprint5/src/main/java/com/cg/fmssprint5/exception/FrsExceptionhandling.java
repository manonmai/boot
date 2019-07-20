package com.cg.fmssprint5.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
@RestController
public class FrsExceptionhandling {
	@ExceptionHandler(FRSException.class)
	public ResponseEntity<ErrorDetails> errorHandle(FRSException ex, WebRequest request)
	{
		ErrorDetails details = new ErrorDetails(ex.getMessage(),request.getDescription(false));
		return new ResponseEntity<>(details,HttpStatus.NOT_FOUND);
		}
}