package it.mauluk92.theatre.repository.exception;

import it.mauluk92.theatre.models.error.ErrorModel;

import java.util.ArrayList;
import java.util.List;

public class DaoException extends Exception {

    private int statusCode;
    private String path;
    private List<ErrorModel> errors = new ArrayList<>();

    public DaoException() {
    }

    public DaoException(String message) {
        super(message);
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
