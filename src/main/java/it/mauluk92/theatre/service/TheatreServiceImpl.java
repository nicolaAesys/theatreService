package it.mauluk92.theatre.service;

import it.mauluk92.theatre.repository.TheatreRepository;
import it.mauluk92.theatre.repository.exception.DaoException;
import it.mauluk92.theatre.service.exception.ServiceException;
import it.mauluk92.theatre.service.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;


public class TheatreServiceImpl<T, D> implements TheatreService<D> {
    @Autowired
    private TheatreRepository<T> theatreRepository;
    @Autowired
    private ModelMapper<T,D> modelMapper;

    @Override
    public D getById(int id) throws ServiceException {
        try {
            return modelMapper.toDtoObject(,theatreRepository.getById(id));

        } catch (DaoException e) {
            throw catchDaoException(e);
        }
    }

    @Override
    public D add(D entity) throws ServiceException {
        return null;
    }

    @Override
    public String delete(int id) throws ServiceException {
        return null;
    }

    @Override
    public D update(int id, D updated) throws ServiceException {
        return null;
    }

    public void setModelMapper(ModelMapper<T, D> modelMapper) {
        this.modelMapper = modelMapper;
    }

    public ModelMapper<T,D> getModelMapper(){
        return this.modelMapper;
    }

    public TheatreRepository<T> getTheatreRepository() {
        return theatreRepository;
    }


    public ServiceException catchDaoException(DaoException exception){
        ServiceException serviceException = new ServiceException(exception.getMessage());
        serviceException.setPath(exception.getPath());
        serviceException.setStatusCode(exception.getStatusCode());
        serviceException.setErrors(exception.getErrors());
        return serviceException;
    }

}
