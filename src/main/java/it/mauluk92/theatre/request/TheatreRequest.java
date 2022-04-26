package it.mauluk92.theatre.request;

import it.mauluk92.theatre.dtos.CatalogueSystemDto;

public abstract class TheatreRequest<D extends CatalogueSystemDto> {

    private D requestDto;

    public TheatreRequest(){}

    public TheatreRequest(D requestDto) {
        this.requestDto = requestDto;
    }

    public D getRequestDto() {
        return requestDto;
    }

    public void setRequestDto(D requestDto) {
        this.requestDto = requestDto;
    }
}
