package it.mauluk92.theatre.models;

import java.util.List;

public class Symphony implements CatalogueSystemTheatre {
    private String name;
    private int id;

    private List<Integer> musicalScoresIds;

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

    public void setMusicalScoresIds(List<Integer> musicalScoresIds) {
        this.musicalScoresIds = musicalScoresIds;
    }

    public List<Integer> getMusicalScoresIds() {
        return musicalScoresIds;
    }

}
