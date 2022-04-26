package it.mauluk92.theatre.service;

import it.mauluk92.theatre.dtos.OrchestraDto;
import it.mauluk92.theatre.models.Orchestra;
import it.mauluk92.theatre.repository.OrchestraRepositoryImpl;
import it.mauluk92.theatre.service.modelmapper.OrchestraModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public abstract class OrchestraServiceImpl extends TheatreServiceImpl<Orchestra, OrchestraDto> {

}
