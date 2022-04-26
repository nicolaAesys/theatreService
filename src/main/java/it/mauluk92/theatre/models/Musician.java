package it.mauluk92.theatre.models;

import org.springframework.stereotype.Component;

@Component
public class Musician implements CatalogueSystemTheatre {

    private String instrument;
    private String name;
    private int id;

    @Override
    public void setId(int id) {
        this.id = id;
    }
    @Override
    public int getId(){
        return this.id;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

}
