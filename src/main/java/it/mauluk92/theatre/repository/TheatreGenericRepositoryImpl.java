package it.mauluk92.theatre.repository;

import it.mauluk92.theatre.models.CatalogueSystemTheatre;
import it.mauluk92.theatre.models.Musician;
import it.mauluk92.theatre.models.error.ErrorModel;
import it.mauluk92.theatre.repository.exception.DaoException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import java.util.ArrayList;
import java.util.List;

public class TheatreGenericRepositoryImpl<T extends CatalogueSystemTheatre> implements TheatreRepository<T> {

    private List<T> mockedDb;

    private String path;

    @Autowired
    public TheatreGenericRepositoryImpl(String path){
        this.path = path;
        this.mockedDb = new ArrayList<>();
    }

    public List<T> getMockedDb(String path) {
        return mockedDb;
    }

    public void setMockedDb(List<T> mockedDb) {
        this.mockedDb = mockedDb;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }



    @Override
    public T getById(int id) throws DaoException {
        if(this.mockedDb.get(id-1) == null){
            DaoException exception = new DaoException("Object not found!");
            exception.setPath(getPath());
            exception.setStatusCode(HttpStatus.NOT_FOUND.value());
            exception.getErrors().add(new ErrorModel("Object Id", "Object with given Id not found!"));
            throw exception;
        }
        return mockedDb.get(id-1);
    }

    @Override
    public void add(T entity) throws DaoException {
        for(T record: mockedDb){
            boolean testId = record.getId() == entity.getId();
            boolean testName = entity.getName().equals(record.getName());
            if(testId || testName){
                DaoException exception = new DaoException("Object already in Db!");
                exception.setPath(getPath());
                exception.setStatusCode(HttpStatus.BAD_REQUEST.value());
                if(testId) {
                    exception.getErrors().add(new ErrorModel("Object Id", "Object with given id already registered!"));
                }
                if(testName){
                    exception.getErrors().add(new ErrorModel("Object Name", "Object with given name is already registered!"));
                }
                throw exception;
            }

        }
        this.mockedDb.add(entity.getId()-1, entity);
    }

    @Override
    public void delete(int id) throws DaoException {
        if(this.mockedDb.get(id-1) == null){
            DaoException exception = new DaoException("Object not found!");
            exception.setPath(getPath());
            exception.setStatusCode(HttpStatus.NOT_FOUND.value());
            exception.getErrors().add(new ErrorModel("Object Id", "Object with given Id not found!"));
            throw exception;
        }
        this.mockedDb.remove(id -1);
    }

    @Override
    public T update(int id, T entity) throws DaoException {
        for (T record : mockedDb) {
            boolean testSameObject = id == entity.getId();
            boolean testId = record.getId() == entity.getId();
            boolean testName = entity.getName().equals(record.getName());
            if (testId || testName || testSameObject) {
                DaoException exception = new DaoException("Object already in Db!");
                exception.setPath(getPath());
                exception.setStatusCode(HttpStatus.BAD_REQUEST.value());
                if (testId) {
                    exception.getErrors().add(new ErrorModel("Object Id", "Object with given id already registered!"));
                }
                if (testName) {
                    exception.getErrors().add(new ErrorModel("Object Name", "Object with given name is already registered!"));
                }
                if (testSameObject) {
                    exception.getErrors().add(new ErrorModel("Id Mismatch", "Id of the given object to update doesn't correspond to the id given!"));
                }
                throw exception;
            }

        }
        this.mockedDb.set(entity.getId() - 1, entity);
        return entity;

    }

}
