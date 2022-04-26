package it.mauluk92.theatre.models;

public abstract class TheatreCatalogueSystemImpl implements CatalogueSystem {

    private String name;
    private int id;

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
