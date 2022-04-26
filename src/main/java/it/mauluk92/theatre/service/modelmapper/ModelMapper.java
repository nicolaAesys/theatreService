package it.mauluk92.theatre.service.modelmapper;

import it.mauluk92.theatre.dtos.CatalogueSystemDto;
import it.mauluk92.theatre.models.CatalogueSystem;

public interface ModelMapper<T, D> {

    T toModelObject(Class<T> modelClass, D DtoObject);
    D toDtoObject(Class<D> dtoClass, T ModelObject);
}
