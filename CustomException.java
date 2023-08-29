package com.example.Exception;

public class CustomException extends RuntimeException {
    // Implement constructor and additional methods
}

@ControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {
    // Implement exception handling and response customization
}

