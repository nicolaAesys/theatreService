package it.mauluk92.theatre.models;

import org.springframework.stereotype.Component;

import java.util.List;

public class Orchestra extends TheatreCatalogueSystemImpl {
    private List<Integer> musicianIds;
    private int symphonyId;

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
