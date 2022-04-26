package it.mauluk92.theatre.controller;

import it.mauluk92.theatre.dtos.OrchestraDto;
import org.springframework.web.bind.annotation.RequestMapping;

//@RestController
@RequestMapping("/Orchestra")
public class OrchestraControllerImpl extends TheatreControllerImpl<OrchestraDto, OrchestraRequest> {


}
