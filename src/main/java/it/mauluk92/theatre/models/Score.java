package it.mauluk92.theatre.models;

import java.util.List;
public class Score implements CatalogueSystemTheatre {

    private String name;
    private int id;

    @Override
    public String getName() {
        return name;
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public int getId() {
        return id;
    }
    @Override
    public void setId(int id) {
        this.id = id;
    }

    private List<Note> musicalSheet;

    public List<Note> getMusicalSheet() {
        return musicalSheet;
    }

    public void setMusicalSheet(List<Note> musicalSheet) {
        this.musicalSheet = musicalSheet;
    }
}
