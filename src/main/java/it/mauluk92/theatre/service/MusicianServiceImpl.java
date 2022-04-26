package it.mauluk92.theatre.service;

import it.mauluk92.theatre.dtos.MusicianDto;
import it.mauluk92.theatre.models.Musician;
import it.mauluk92.theatre.models.error.ErrorModel;
import it.mauluk92.theatre.repository.TheatreRepository;
import it.mauluk92.theatre.repository.exception.DaoException;
import it.mauluk92.theatre.service.exception.ServiceException;
import it.mauluk92.theatre.service.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class MusicianServiceImpl extends TheatreServiceImpl<Musician, MusicianDto> {


    @Autowired
    private TheatreRepository<Musician> musicianRepo;
    @Autowired
    private ModelMapper<Musician, MusicianDto> musicianModelMapper;

    @Override
    public MusicianDto add(MusicianDto musicianDto) throws ServiceException {
        try {
            this.musicianRepo.add(getModelMapper().toModelObject(Musician.class,musicianDto));
            return musicianDto;
        } catch (DaoException e) {
            throw this.catchDaoException(e);
        }

    }



    @Override
    public MusicianDto getById(int id) throws ServiceException {
        try{
            return musicianModelMapper.toDtoObject(MusicianDto.class,this.getTheatreRepository().getById(id-1));

        }catch (DaoException e){
            throw this.catchDaoException(e);
        }
    }

    @Override
    public String delete(int id) throws ServiceException {
       try{
           this.musicianRepo.delete(id -1);
           return "Success!";
       }catch (DaoException e){
           throw this.catchDaoException(e);
       }
    }

    @Override
    public MusicianDto update(int id, MusicianDto dtoObject) throws ServiceException {
        try{
            this.musicianRepo.update(id, this.getModelMapper().toModelObject(Musician.class, dtoObject));
            return dtoObject;
        }catch (DaoException e){
            throw this.catchDaoException(e);
        }
    }
}
