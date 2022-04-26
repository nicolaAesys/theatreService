package it.mauluk92.theatre.service.modelmapper;

import it.mauluk92.theatre.dtos.CatalogueSystemDto;
import it.mauluk92.theatre.dtos.TheatreCatalogueSystemDtoImpl;
import it.mauluk92.theatre.models.CatalogueSystem;
import it.mauluk92.theatre.models.TheatreCatalogueSystemImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

public abstract class ModelMapperCatalogueImpl<T extends CatalogueSystem, D extends CatalogueSystemDto> implements ModelMapper<T,D> {

    @Autowired
    ApplicationContext ctx;
    public ModelMapperCatalogueImpl() {
    }


    @Override
    public T toModelObject(Class<T> modelClass, D dtoObject) {
        T modelObject = ctx.getBean(modelClass);
        modelObject.setId((dtoObject.getId()));
        modelObject.setName(dtoObject.getName());
        return modelObject;
    }

    @Override
    public D toDtoObject(Class<D> dtoClass, T modelObject) {
        D dtoObject = ctx.getBean(dtoClass);
        dtoObject.setId((modelObject.getId()));
        dtoObject.setName(modelObject.getName());
        return dtoObject;
    }
}
