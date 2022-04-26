package it.mauluk92.theatre.controller;

import it.mauluk92.theatre.service.exception.ServiceException;

public interface TheatreController<D, R> {

    D getById(int id) throws ServiceException;
    D add(R request) throws ServiceException;
    String delete(int id) throws ServiceException;
    D update(int id, R request) throws ServiceException;

}
