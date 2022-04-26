package it.mauluk92.theatre.service;

import it.mauluk92.theatre.models.Score;
import it.mauluk92.theatre.repository.ScoreRepositoryImpl;
import it.mauluk92.theatre.service.modelmapper.ScoreModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public abstract class ScoreServiceImpl extends TheatreServiceImpl<Score, it.mauluk92.theatre.dtos.ScoreDto> {

}
