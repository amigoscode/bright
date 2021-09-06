package com.darrentech.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class SuperHeroNotFoundException extends RuntimeException {
    public SuperHeroNotFoundException(String message) {
        super(message);
    }
}
