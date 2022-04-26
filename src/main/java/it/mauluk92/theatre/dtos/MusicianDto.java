package it.mauluk92.theatre.dtos;


import javax.validation.constraints.Pattern;


public class MusicianDto implements CatalogueSystemTheatreDto{

    @Pattern(regexp = "^([A-Za-z]+(['\\sA-Za-z]+)?)$" , message="Instrument name can only contain letters,whitespaces or '")
    private String instrument;
    private int id;
    private String name;
    private String fullDescription;

    public String getInstrument() {
        return instrument;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public int getId() {
        return id;
    }
    @Override
    public void setId(int id) {
        this.id = id;
    }
    @Override
    public void setName(String name) {
        this.name = name;
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
