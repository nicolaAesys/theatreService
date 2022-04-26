package it.mauluk92.theatre.controller;

import it.mauluk92.theatre.dtos.SymphonyDto;
import it.mauluk92.theatre.request.SymphonyRequest;
import it.mauluk92.theatre.service.SymphonyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@RequestMapping("/symphony")
public class SymphonyControllerImpl extends TheatreControllerImpl<SymphonyDto, SymphonyRequest> {

}
