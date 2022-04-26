package it.mauluk92.theatre.service.modelmapper;

import it.mauluk92.theatre.dtos.CatalogueSystemDto;
import it.mauluk92.theatre.dtos.MusicianDto;
import it.mauluk92.theatre.dtos.TheatreCatalogueSystemDtoImpl;
import it.mauluk92.theatre.models.CatalogueSystem;
import it.mauluk92.theatre.models.Musician;
import it.mauluk92.theatre.models.TheatreCatalogueSystemImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicianModelMapper extends ModelMapperCatalogueImpl<Musician, MusicianDto>{

    @Override
    public Musician toModelObject(Class<Musician> clazz, MusicianDto musicianDto) {
        Musician modelObject = super.toModelObject(clazz, musicianDto);
        modelObject.setInstrument(musicianDto.getInstrument());
        return modelObject;
    }

    @Override
    public MusicianDto toDtoObject(Class<MusicianDto> clazz, Musician musician) {
        MusicianDto dtoObject = super.toDtoObject(clazz, musician);
        dtoObject.setInstrument(dtoObject.getInstrument());
        return dtoObject;
    }
}
