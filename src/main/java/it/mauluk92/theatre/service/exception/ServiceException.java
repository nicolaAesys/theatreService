package it.mauluk92.theatre.service.exception;

import it.mauluk92.theatre.models.error.ErrorModel;

import java.util.ArrayList;
import java.util.List;

public class ServiceException extends Exception{

    private List<ErrorModel> errors = new ArrayList<>();
    private int statusCode;
    private String path;

    public ServiceException() {}

    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(Throwable cause) {
        super(cause);
    }


    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public List<ErrorModel> getErrors() {
        return errors;
    }

    public void setErrors(List<ErrorModel> errors) {
        this.errors = errors;
    }
}
