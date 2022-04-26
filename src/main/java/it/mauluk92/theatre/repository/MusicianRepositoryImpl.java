package it.mauluk92.theatre.repository;

import it.mauluk92.theatre.models.Musician;
import it.mauluk92.theatre.models.error.ErrorModel;
import it.mauluk92.theatre.repository.exception.DaoException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MusicianRepositoryImpl extends TheatreRepositoryImpl<Musician> {

    List<Musician> musicianDb;

    public MusicianRepositoryImpl(){
        super();
        this.musicianDb = new ArrayList<>();
        super.setPath("/musician");
    }

    @Override
    public void add(Musician entity) throws DaoException {
        if(this.musicianDb.stream().anyMatch(record -> record.getName().equalsIgnoreCase(entity.getName()))){
            DaoException exception = new DaoException();
            exception.setPath(getPath());
            exception.setStatusCode(HttpStatus.BAD_REQUEST.value());
            exception.getErrors().add(new ErrorModel("Object Name", "Object with given name already registered!"));
            throw exception;
        }else{
            this.musicianDb.add(entity);
        }
    }
}
