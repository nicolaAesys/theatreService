package it.mauluk92.theatre.service;

import it.mauluk92.theatre.dtos.MusicianDto;
import it.mauluk92.theatre.dtos.OrchestraDto;
import it.mauluk92.theatre.models.Musician;
import it.mauluk92.theatre.models.Orchestra;
import it.mauluk92.theatre.repository.TheatreRepository;
import it.mauluk92.theatre.service.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public abstract class OrchestraServiceImpl extends TheatreServiceImpl<Orchestra, OrchestraDto> {

    @Autowired
    private TheatreRepository<Orchestra> orchestraRepo;
    @Autowired
    private ModelMapper<Orchestra, OrchestraDto> orchestraModelMapper;


}
