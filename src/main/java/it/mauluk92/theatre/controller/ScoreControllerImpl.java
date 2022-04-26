package it.mauluk92.theatre.controller;

import it.mauluk92.theatre.dtos.ScoreDto;
import org.springframework.web.bind.annotation.RequestMapping;

//@RestController
@RequestMapping("/score")
public class ScoreControllerImpl extends TheatreControllerImpl<ScoreDto, ScoreRequest> {



}
