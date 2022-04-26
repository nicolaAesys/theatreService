package it.mauluk92.theatre.service.modelmapper;

import it.mauluk92.theatre.dtos.OrchestraDto;
import it.mauluk92.theatre.models.Orchestra;
import org.springframework.stereotype.Component;

@Component
public class OrchestraModelMapper extends ModelMapperCatalogueImpl<Orchestra, OrchestraDto> {


    @Override
    public Orchestra toModelObject(Class<Orchestra> clazz, OrchestraDto orchestraDto) {
        Orchestra modelObject = super.toModelObject(clazz, orchestraDto);
        modelObject.setId(orchestraDto.getId());
        modelObject.setName(orchestraDto.getName());
        modelObject.setMusicianIds(orchestraDto.getMusicianIds());
        modelObject.setSymphonyId(orchestraDto.getSymphonyId());
        return modelObject;
    }

    @Override
    public OrchestraDto toDtoObject(Class<OrchestraDto> clazz, Orchestra orchestra) {
        OrchestraDto dtoObject = super.toDtoObject(clazz, orchestra);
        dtoObject.setName(orchestra.getName());
        dtoObject.setId(orchestra.getId());
        dtoObject.setMusicianIds(orchestra.getMusicianIds());
        dtoObject.setSymphonyId(orchestra.getSymphonyId());
        return dtoObject;
    }

}
