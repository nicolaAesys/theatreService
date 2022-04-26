package it.mauluk92.theatre.models;

import java.util.List;

public class Orchestra implements CatalogueSystemTheatre {

    private String name;
    private int id;
    private List<Integer> musicianIds;
    private int symphonyId;


    @Override
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public void setId(int id) {
        this.id = id;
    }
    @Override
    public int getId() {
        return id;
    }

    public int  getSymphonyId() {
        return symphonyId;
    }

    public void setSymphonyId(int symphonyId) {
        this.symphonyId = symphonyId;
    }

    public List<Integer> getMusicianIds() {
        return musicianIds;
    }

    public void setMusicianIds(List<Integer> musicianIds) {
        this.musicianIds = musicianIds;
    }
}
