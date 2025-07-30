package com.eazybytes.loans.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST) // if i try to throw this exception in the response then the response status will be 400
public class LoanAlreadyExistsException extends RuntimeException { // to make any custom exception it should extend the runtime exception
    public LoanAlreadyExistsException(String message){
        super(message); // super keyword is used to call the constructor of the parent class
    }
}
