package it.mauluk92.theatre.dtos;

import org.springframework.stereotype.Component;

import java.util.List;

public class ScoreDto extends TheatreCatalogueSystemDtoImpl{
    private List<NoteDto> musicalSheetDto;

    public List<NoteDto> getMusicalSheet() {
        return musicalSheetDto;
    }

    public void setMusicalSheet(List<NoteDto> musicalSheetDto) {
        this.musicalSheetDto = musicalSheetDto;
    }
}
