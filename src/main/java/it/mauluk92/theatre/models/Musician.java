package it.mauluk92.theatre.models;

import org.springframework.stereotype.Component;

@Component
public class Musician extends TheatreCatalogueSystemImpl {
    private String instrument;

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

}
