package it.mauluk92.theatre.service.modelmapper;

import it.mauluk92.theatre.dtos.ScoreDto;
import it.mauluk92.theatre.models.Score;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;
@Component
public class ScoreModelMapper extends ModelMapperCatalogueImpl<Score, it.mauluk92.theatre.dtos.ScoreDto>{
/*
    @Autowired
    public ScoreModelMapper(){
        this.setModelObjectCast(new Score());
        this.setDtoObjectCast(new ScoreDto());
    }
    @Override
    public Score toModelObject(it.mauluk92.theatre.dtos.ScoreDto scoreDto) {
        NoteMapper noteMapper = new NoteMapper();
        super.getModelObjectCast().setMusicalSheet(scoreDto.getMusicalSheet().stream().map(noteMapper::toModelObject).collect(Collectors.toList()));
        return super.toModelObject(scoreDto);
    }

    @Override
    public it.mauluk92.theatre.dtos.ScoreDto toDtoObject(Score score) {
        NoteMapper noteMapper = new NoteMapper();
        super.getDtoObjectCast().setMusicalSheet(score.getMusicalSheet().stream().map(noteMapper::toDtoObject).collect(Collectors.toList()));
        return super.toDtoObject(score);
    }

 */
}
