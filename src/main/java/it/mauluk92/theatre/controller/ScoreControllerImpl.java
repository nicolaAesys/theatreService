package it.mauluk92.theatre.controller;

import it.mauluk92.theatre.dtos.ScoreDto;
import it.mauluk92.theatre.request.ScoreRequest;
import it.mauluk92.theatre.service.ScoreServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@RequestMapping("/score")
public class ScoreControllerImpl extends TheatreControllerImpl<ScoreDto, ScoreRequest> {



}
