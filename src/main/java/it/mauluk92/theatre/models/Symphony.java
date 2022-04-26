package it.mauluk92.theatre.models;

import org.springframework.stereotype.Component;

import java.util.List;

public class Symphony extends TheatreCatalogueSystemImpl {

    private List<Integer> musicalScoresIds;

    public List<Integer> getMusicalScoresIds() {
        return musicalScoresIds;
    }

    public void setMusicalScores(List<Integer> musicalScoresIds) {
        this.musicalScoresIds = musicalScoresIds;
    }
}
