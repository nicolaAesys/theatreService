package it.mauluk92.theatre.repository;

import it.mauluk92.theatre.models.Symphony;
import org.springframework.stereotype.Repository;

@Repository
public class SymphonyRepositoryImpl extends TheatreRepositoryImpl<Symphony> {

    public SymphonyRepositoryImpl(){
        super();
        super.setPath("/symphony");
    }
}
