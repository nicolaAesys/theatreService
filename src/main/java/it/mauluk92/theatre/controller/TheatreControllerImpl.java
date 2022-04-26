package it.mauluk92.theatre.controller;

import it.mauluk92.theatre.request.TheatreRequest;
import it.mauluk92.theatre.service.TheatreService;
import it.mauluk92.theatre.service.exception.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

public abstract class TheatreControllerImpl<D, R extends TheatreRequest<D>> implements TheatreController<D,R>{
    @Autowired
    TheatreService<D> theatreService;

    public TheatreControllerImpl(){}


    public TheatreService<D> getTheatreService() {
        return theatreService;
    }

    public void setTheatreService(TheatreService<D> theatreService) {
        this.theatreService = theatreService;
    }

    @GetMapping("{id}")
    @Override
    public D getById(@Valid @PathVariable int id) throws ServiceException {
        return this.theatreService.getById(id);
    }

    @PostMapping
    @Override
    public D add(@Valid @RequestBody R request) throws ServiceException {
        return this.theatreService.add(request.getRequestDto());
    }

    @DeleteMapping("{id}")
    @Override
    public String delete(@Valid @PathVariable int id) throws ServiceException {
        return this.theatreService.delete(id);
    }

    @PutMapping("{id}")
    @Override
    public D update(@Valid @PathVariable int id, @RequestBody R request) throws ServiceException {
        return this.theatreService.update(id, request.getRequestDto());
    }
}
