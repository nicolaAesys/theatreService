package it.mauluk92.theatre.controller;

import it.mauluk92.theatre.dtos.MusicianDto;
import it.mauluk92.theatre.models.Musician;
import it.mauluk92.theatre.request.MusicianRequest;
import it.mauluk92.theatre.service.MusicianServiceImpl;
import it.mauluk92.theatre.service.TheatreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/musician")
public class MusicianControllerImpl extends TheatreControllerImpl<MusicianDto, MusicianRequest> {

}
