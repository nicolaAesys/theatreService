package it.mauluk92.theatre.dtos;


import org.springframework.stereotype.Component;

import javax.validation.constraints.Pattern;


public class MusicianDto extends TheatreCatalogueSystemDtoImpl {

    @Pattern(regexp = "^([A-Za-z]+(['\\sA-Za-z]+)?)$" , message="Instrument name can only contain letters,whitespaces or '")
    private String instrument;
    private String fullDescription;

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public String getFullDescription() {
        return fullDescription;
    }

    public void setFullDescription(String fullDescription) {
        this.fullDescription = fullDescription;
    }
}
