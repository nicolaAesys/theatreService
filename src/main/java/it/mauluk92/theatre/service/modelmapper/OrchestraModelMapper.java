package it.mauluk92.theatre.service.modelmapper;

import it.mauluk92.theatre.dtos.OrchestraDto;
import it.mauluk92.theatre.models.Orchestra;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrchestraModelMapper extends ModelMapperCatalogueImpl<Orchestra, OrchestraDto> {
/*
    @Autowired
    public OrchestraModelMapper(){
        this.setModelObjectCast(new Orchestra());
        this.setDtoObjectCast(new OrchestraDto());
    }
    @Override
    public Orchestra toModelObject(OrchestraDto orchestraDto) {
        super.getModelObjectCast().setMusicianIds(orchestraDto.getMusicianIds());
        super.getModelObjectCast().setSymphonyId(orchestraDto.getSymphonyId());
        return super.toModelObject(orchestraDto);
    }

    @Override
    public OrchestraDto toDtoObject(Orchestra orchestra) {
        super.getDtoObjectCast().setMusicianIds(orchestra.getMusicianIds());
        super.getDtoObjectCast().setSymphonyId(orchestra.getSymphonyId());
        return super.toDtoObject(orchestra);
    }

 */
}
