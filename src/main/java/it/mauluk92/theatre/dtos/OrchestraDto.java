package it.mauluk92.theatre.dtos;

import org.springframework.stereotype.Component;

import javax.validation.Valid;
import javax.validation.constraints.Pattern;
import java.util.List;

public class OrchestraDto extends TheatreCatalogueSystemDtoImpl {
    @Pattern(regexp = "^\\d+$", message="Id must be numeric!")
    private List<Integer> musicianIds;
    @Pattern(regexp = "^\\d+$", message="Id must be numeric!")
    private int symphonyId;

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

