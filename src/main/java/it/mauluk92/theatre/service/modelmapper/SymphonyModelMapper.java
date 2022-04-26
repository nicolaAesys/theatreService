package it.mauluk92.theatre.service.modelmapper;

import it.mauluk92.theatre.dtos.MusicianDto;
import it.mauluk92.theatre.dtos.SymphonyDto;
import it.mauluk92.theatre.models.Score;
import it.mauluk92.theatre.models.Symphony;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class SymphonyModelMapper extends ModelMapperCatalogueImpl<Symphony, SymphonyDto>{

    @Override
    public Symphony toModelObject(Class<Symphony> clazz, SymphonyDto symphonyDto) {
        Symphony modelObject = super.toModelObject(clazz, symphonyDto);
        modelObject.setName(symphonyDto.getName());
        modelObject.setId(symphonyDto.getId());
        modelObject.setMusicalScoresIds(symphonyDto.getMusicalScoreDtoIds());
        return modelObject;
    }

    @Override
    public SymphonyDto toDtoObject(Class<SymphonyDto> clazz, Symphony symphony) {
        SymphonyDto dtoObject = super.toDtoObject(clazz, symphony);
        dtoObject.setName(symphony.getName());
        dtoObject.setId(symphony.getId());
        dtoObject.setMusicalScoreDtoIds(symphony.getMusicalScoresIds());
        return dtoObject;

    }

}
