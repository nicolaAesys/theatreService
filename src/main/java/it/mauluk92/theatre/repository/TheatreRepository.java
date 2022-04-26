package it.mauluk92.theatre.repository;

import it.mauluk92.theatre.repository.exception.DaoException;

public interface TheatreRepository<T> {

    T getById(int id) throws DaoException;
    void add(T entity) throws DaoException;
    void delete(int id) throws DaoException;
    T update(int id, T updated) throws DaoException;
}
