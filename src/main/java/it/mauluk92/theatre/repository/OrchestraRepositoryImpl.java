package it.mauluk92.theatre.repository;

import it.mauluk92.theatre.models.Orchestra;
import org.springframework.stereotype.Repository;

@Repository
public class OrchestraRepositoryImpl extends TheatreRepositoryImpl<Orchestra> {

    public OrchestraRepositoryImpl(){
        super();
        super.setPath("/orchestra");
    }
}
