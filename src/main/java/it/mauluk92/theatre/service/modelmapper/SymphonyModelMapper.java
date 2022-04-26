package it.mauluk92.theatre.service.modelmapper;

import it.mauluk92.theatre.dtos.SymphonyDto;
import it.mauluk92.theatre.models.Score;
import it.mauluk92.theatre.models.Symphony;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class SymphonyModelMapper extends ModelMapperCatalogueImpl<Symphony, SymphonyDto>{
/*
    @Autowired
    public SymphonyModelMapper(){
        this.setModelObjectCast(new Symphony());
        this.setDtoObjectCast(new SymphonyDto());
    }
    @Override
    public Symphony toModelObject(SymphonyDto symphonyDto) {
        super.getModelObjectCast().setMusicalScores(symphonyDto.getMusicalScores());
        return super.toModelObject(symphonyDto);
    }

    @Override
    public SymphonyDto toDtoObject(Symphony symphony) {
        super.getDtoObjectCast().setMusicalScores(symphony.getMusicalScoresIds());
        return super.toDtoObject(symphony);
    }

 */
}
