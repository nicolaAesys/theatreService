package it.mauluk92.theatre.controller;

import it.mauluk92.theatre.dtos.SymphonyDto;
import org.springframework.web.bind.annotation.RequestMapping;

//@RestController
@RequestMapping("/symphony")
public class SymphonyControllerImpl extends TheatreControllerImpl<SymphonyDto, SymphonyRequest> {

}
