package com.example.valid.exception;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author luoyaa
 * @date 2024-04-12 17:42:28
 */
@RestControllerAdvice(annotations = RestController.class)
public class GlobalException {

    @ExceptionHandler(Exception.class)
    public String exceptionHandler(Exception e) {
        if (e instanceof MethodArgumentNotValidException) {
            return ((MethodArgumentNotValidException) e).getBindingResult().getFieldError().getDefaultMessage();
        }
        return "异常了";
    }
}
