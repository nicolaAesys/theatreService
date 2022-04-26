package it.mauluk92.theatre.service.modelmapper;

import it.mauluk92.theatre.dtos.MusicianDto;
import it.mauluk92.theatre.dtos.ScoreDto;
import it.mauluk92.theatre.models.Musician;
import it.mauluk92.theatre.models.Score;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;
@Component
public class ScoreModelMapper extends ModelMapperCatalogueImpl<Score, ScoreDto>{


    @Override
    public Score toModelObject(Class<Score> clazz ,ScoreDto scoreDto) {
        NoteMapper noteMapper = new NoteMapper();
        Score modelObject = super.toModelObject(clazz, scoreDto);
        modelObject.setId(scoreDto.getId());
        modelObject.setName(scoreDto.getName());
        modelObject.setMusicalSheet(scoreDto.getMusicalSheet().stream().map(noteMapper::toModelObject).collect(Collectors.toList()));
        return modelObject;
    }

    @Override
    public ScoreDto toDtoObject(Class<ScoreDto> clazz, Score score) {
        NoteMapper noteMapper = new NoteMapper();
        ScoreDto dtoObject = super.toDtoObject(clazz, score);
        dtoObject.setName(score.getName());
        dtoObject.setId(score.getId());
        dtoObject.setMusicalSheet(score.getMusicalSheet().stream().map(noteMapper::toDtoObject).collect(Collectors.toList()));
        return dtoObject;
    }



}
