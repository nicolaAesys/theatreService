package it.mauluk92.theatre.service;

import it.mauluk92.theatre.service.exception.ServiceException;

public interface TheatreService<D>{

    D getById(int id) throws ServiceException;
    D add(D entity) throws ServiceException;
    String delete(int id) throws ServiceException;
    D update(int id, D updated) throws ServiceException;

}
