package it.mauluk92.theatre.dtos;

import java.util.List;

public class SymphonyDto implements CatalogueSystemTheatreDto {

    private String name;
    private int id;

    private List<Integer> musicalScoreDtoIds;

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

    public List<Integer> getMusicalScoreDtoIds() {
        return musicalScoreDtoIds;
    }

    public void setMusicalScoreDtoIds(List<Integer> musicalScoreDtoIds) {
        this.musicalScoreDtoIds = musicalScoreDtoIds;
    }
}
