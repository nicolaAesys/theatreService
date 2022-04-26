package it.mauluk92.theatre.controller;

import it.mauluk92.theatre.dtos.MusicianDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/musician")
public class MusicianControllerImpl extends TheatreControllerImpl<MusicianDto, MusicianRequest> {


}
