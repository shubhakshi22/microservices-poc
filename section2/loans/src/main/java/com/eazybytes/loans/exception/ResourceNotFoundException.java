package com.eazybytes.loans.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String resourceName, String message, String fieldValue) {
        super(String.format("%s not found with the given input data %s : '%s'", resourceName, message, fieldValue)); // format method generate the string is whatever format we wanted it to be like resourceName, fieldName and field Value will replaced by %s wherever we used in given string. This is how we make single string value of these input parameters using format method.
    }
}
