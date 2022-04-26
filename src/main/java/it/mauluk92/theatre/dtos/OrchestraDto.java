package it.mauluk92.theatre.dtos;

import javax.validation.constraints.Pattern;
import java.util.List;

public class OrchestraDto implements CatalogueSystemTheatreDto {

    private int id;
    private String name;
    @Pattern(regexp = "^\\d+$", message="Id must be numeric!")
    private List<Integer> musicianIds;
    @Pattern(regexp = "^\\d+$", message="Id must be numeric!")
    private int symphonyId;
    @Override
    public int getId() {
        return id;
    }
    @Override
    public void setId(int id) {
        this.id = id;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }

    public int getSymphonyId() {
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

