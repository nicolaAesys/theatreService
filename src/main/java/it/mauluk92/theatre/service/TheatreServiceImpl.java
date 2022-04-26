package it.mauluk92.theatre.service;

import it.mauluk92.theatre.dtos.CatalogueSystemDto;
import it.mauluk92.theatre.models.CatalogueSystem;
import it.mauluk92.theatre.repository.TheatreRepository;
import it.mauluk92.theatre.repository.exception.DaoException;
import it.mauluk92.theatre.service.exception.ServiceException;
import it.mauluk92.theatre.service.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;


public abstract class TheatreServiceImpl<T extends CatalogueSystem, D extends CatalogueSystemDto> implements TheatreService<D> {
    @Autowired
    private TheatreRepository<T> theatreRepository;
    @Autowired
    private ModelMapper<T,D> modelMapper;

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
