package it.mauluk92.theatre.controller;

import it.mauluk92.theatre.models.error.ApiError;
import it.mauluk92.theatre.models.error.ErrorModel;
import it.mauluk92.theatre.service.exception.ServiceException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import java.util.stream.Collectors;


@ControllerAdvice
public class TheatreControllerAdvice {

    @ExceptionHandler(value = ServiceException.class)
    public ResponseEntity<ApiError> serviceExceptionHandler(ServiceException ex, WebRequest request){
        ApiError error = new ApiError();
        error.setStatusCode(ex.getStatusCode());
        error.setMessage(ex.getMessage());
        error.setPath(ex.getPath());
        error.getErrors().addAll(ex.getErrors());

        ResponseEntity<ApiError> errorResponse = ResponseEntity.status(ex.getStatusCode()).body(error);
        return errorResponse;
    }

    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public ResponseEntity<ApiError> badRequest(MethodArgumentNotValidException ex, WebRequest request) {

        ApiError error = new ApiError();
        error.setStatusCode(HttpStatus.BAD_REQUEST.value());

        error.setMessage("Bad Request");
        error.setPath(ex.getNestedPath());
        error.getErrors().addAll(ex.getFieldErrors().stream().map(obj -> {
            return new ErrorModel(obj.getField(), obj.getDefaultMessage());
        }).collect(Collectors.toList()));

        ResponseEntity<ApiError> errorResponse = ResponseEntity.badRequest().body(error);
        return errorResponse;
    }

    @ExceptionHandler(value= MethodArgumentTypeMismatchException.class)
    public ResponseEntity<ApiError> argumentTypeMismatch(MethodArgumentTypeMismatchException ex, WebRequest request) {

        ApiError error = new ApiError();
        error.setStatusCode(HttpStatus.BAD_REQUEST.value());
        error.setMessage("Bad Request: cannot parse integer!");

        ResponseEntity<ApiError> errorResponse = ResponseEntity.badRequest().body(error);
        return errorResponse;
    }
}
