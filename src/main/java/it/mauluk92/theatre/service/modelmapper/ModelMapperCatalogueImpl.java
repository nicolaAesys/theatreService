package it.mauluk92.theatre.service.modelmapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

public abstract class ModelMapperCatalogueImpl<T, D> implements ModelMapper<T,D> {

    @Autowired
    ApplicationContext ctx;
    public ModelMapperCatalogueImpl() {
    }


    @Override
    public T toModelObject(Class<T> modelClass, D dtoObject) {
        T modelObject = ctx.getBean(modelClass);
        return modelObject;
    }

    @Override
    public D toDtoObject(Class<D> dtoClass, T modelObject) {
        D dtoObject = ctx.getBean(dtoClass);
        return dtoObject;
    }
}
