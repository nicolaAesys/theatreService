package it.mauluk92.theatre.service.modelmapper;

import it.mauluk92.theatre.dtos.MusicianDto;
import it.mauluk92.theatre.models.Musician;
import org.springframework.stereotype.Component;

@Component
public class MusicianModelMapper extends ModelMapperCatalogueImpl<Musician, MusicianDto>{

    @Override
    public Musician toModelObject(Class<Musician> clazz, MusicianDto musicianDto) {
        Musician modelObject = super.toModelObject(clazz, musicianDto);
        modelObject.setId(musicianDto.getId());
        modelObject.setName(musicianDto.getName());
        modelObject.setInstrument(musicianDto.getInstrument());
        return modelObject;
    }

    @Override
    public MusicianDto toDtoObject(Class<MusicianDto> clazz, Musician musician) {
        MusicianDto dtoObject = super.toDtoObject(clazz, musician);
        dtoObject.setName(musician.getName());
        dtoObject.setId(musician.getId());
        dtoObject.setInstrument(musician.getInstrument());
        return dtoObject;
    }
}
