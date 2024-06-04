package com.riwi.surveys.utils.exceptions;

public class NotAuthorizedException extends RuntimeException{
    public NotAuthorizedException(String id) {
        super(id);
    }
}
