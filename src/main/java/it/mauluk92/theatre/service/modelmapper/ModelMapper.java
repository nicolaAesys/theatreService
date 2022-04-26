package it.mauluk92.theatre.service.modelmapper;

public interface ModelMapper<T, D> {

    T toModelObject(Class<T> modelClass, D DtoObject);
    D toDtoObject(Class<D> dtoClass, T ModelObject);
}
