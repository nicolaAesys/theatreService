package it.mauluk92.theatre.controller;

import it.mauluk92.theatre.dtos.OrchestraDto;
import it.mauluk92.theatre.request.OrchestraRequest;
import it.mauluk92.theatre.service.OrchestraServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@RequestMapping("/Orchestra")
public class OrchestraControllerImpl extends TheatreControllerImpl<OrchestraDto, OrchestraRequest> {


}
