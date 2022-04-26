package it.mauluk92.theatre.dtos;

import java.util.List;

public class ScoreDto implements CatalogueSystemTheatreDto {
    private String name;
    private int id;
    private List<NoteDto> musicalSheetDto;
    @Override
    public String getName() {
        return name;
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public int getId() {
        return id;
    }
    @Override
    public void setId(int id) {
        this.id = id;
    }
    public List<NoteDto> getMusicalSheetDto() {
        return musicalSheetDto;
    }

    public List<NoteDto> getMusicalSheet() {
        return musicalSheetDto;
    }

    public void setMusicalSheet(List<NoteDto> musicalSheetDto) {
        this.musicalSheetDto = musicalSheetDto;
    }
}
