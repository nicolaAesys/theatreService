package it.mauluk92.theatre.dtos;

import javax.validation.constraints.Pattern;

public abstract class TheatreCatalogueSystemDtoImpl implements CatalogueSystemDto{
    @Pattern(regexp="^([A-Za-z]+(['\\sA-Za-z]+)?)$", message="Name can only contain letters,whitespaces or '")
    private String name;
    @Pattern(regexp="^\\d+$", message="Id must be numeric")
    private int id;

    public TheatreCatalogueSystemDtoImpl(){};

    @Override
    public String getName(){
        return this.name;
    }

    @Override
    public void setName(String name){
        this.name = name;
    }

    @Override
    public int getId(){
        return this.id;
    }

    @Override
    public void setId(int id){
        this.id = id;
    }
}
