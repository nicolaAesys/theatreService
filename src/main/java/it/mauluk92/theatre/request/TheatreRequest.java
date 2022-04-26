package it.mauluk92.theatre.request;

public abstract class TheatreRequest<D> {

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
