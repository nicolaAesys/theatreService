package it.mauluk92.theatre.dtos;

import it.mauluk92.theatre.models.Score;
import org.springframework.stereotype.Component;

import java.util.List;

public class SymphonyDto extends TheatreCatalogueSystemDtoImpl {

    private List<Integer> musicalScoreDtoIds;

    public List<Integer> getMusicalScores() {
        return musicalScoreDtoIds;
    }

    public void setMusicalScores(List<Integer> musicalScoresDtoIds) {
        this.musicalScoreDtoIds = musicalScoresDtoIds;
    }
}
