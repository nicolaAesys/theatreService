package it.mauluk92.theatre.repository;

import it.mauluk92.theatre.models.CatalogueSystem;
import it.mauluk92.theatre.models.error.ErrorModel;
import it.mauluk92.theatre.repository.exception.DaoException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import java.util.ArrayList;
import java.util.List;

public abstract class TheatreRepositoryImpl<T extends CatalogueSystem> implements TheatreRepository<T> {

    private List<T> mockedTable = new ArrayList<>(0);
    private String path;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public List<T> getMockedTable() {
        return mockedTable;
    }

    @Override
    public T getById(int id) throws DaoException {
        if(this.mockedTable.size() < id){
            DaoException exception = new DaoException("Id Not Found");
            exception.setPath(getPath() + "/" + id);
            exception.setStatusCode(HttpStatus.NOT_FOUND.value());
            exception.getErrors().add(new ErrorModel("Id", "Object with given id not found!"));
            throw exception;
        }else {
            return mockedTable.get(id - 1);
        }
    }

    @Override
    public void add(T entity) throws DaoException {
        final String name = entity.getName();
        if(this.mockedTable.stream().anyMatch(record -> record.getName().equalsIgnoreCase(entity.getName()))){
            DaoException exception = new DaoException();
            exception.setPath(getPath());
            exception.setStatusCode(HttpStatus.BAD_REQUEST.value());
            exception.getErrors().add(new ErrorModel("Object Name", "Object with given name already registered!"));
            throw exception;
        }else{
            this.mockedTable.add(entity);
        }
    }

    @Override
    public void delete(int id) throws DaoException {
        if(this.mockedTable.size() < id){
            DaoException exception = new DaoException();
            exception.setPath(getPath() +  "/" + id);
            exception.setStatusCode(HttpStatus.NOT_FOUND.value());
            exception.getErrors().add(new ErrorModel("Id", "Object with given Id Not Found!"));
            throw exception;
        }else {
            this.mockedTable.remove(this.mockedTable.get(id - 1));
        }
    }

    @Override
    public T update(int id, T entity) throws DaoException {
        if(this.mockedTable.size() < id){
            DaoException exception = new DaoException("Id Not Found");
            exception.setPath(getPath() + "/" + id);
            exception.setStatusCode(HttpStatus.NOT_FOUND.value());
            exception.getErrors().add(new ErrorModel("Object Id", "Object with given Id not found!"));
            throw exception;
        }else{

        this.mockedTable.set(id-1, entity);

        return entity;}
    }
}
