package it.mauluk92.theatre.repository;

import it.mauluk92.theatre.models.Score;
import org.springframework.stereotype.Repository;

@Repository
public class ScoreRepositoryImpl extends TheatreRepositoryImpl<Score> {

    public ScoreRepositoryImpl(){
        super();
        super.setPath("/score");
    }
}
