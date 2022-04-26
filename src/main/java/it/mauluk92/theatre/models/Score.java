package it.mauluk92.theatre.models;

import org.springframework.stereotype.Component;

import java.util.List;
public class Score extends TheatreCatalogueSystemImpl {

    private List<Note> musicalSheet;

    public List<Note> getMusicalSheet() {
        return musicalSheet;
    }

    public void setMusicalSheet(List<Note> musicalSheet) {
        this.musicalSheet = musicalSheet;
    }
}
