package com.example.enhancer.utils;

public class EnhancerException extends Exception {
    public EnhancerException(String message) {
        super(message);
    }
    public EnhancerException(String message, Throwable cause) {
        super(message, cause);
    }
}
