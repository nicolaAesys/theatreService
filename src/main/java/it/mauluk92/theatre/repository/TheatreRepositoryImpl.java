package it.mauluk92.theatre.repository;

public abstract class TheatreRepositoryImpl<T> implements TheatreRepository<T> {

    private String path;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }



}
