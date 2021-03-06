package it.mauluk92.theatre.service.modelmapper;

import it.mauluk92.theatre.dtos.NoteDto;
import it.mauluk92.theatre.models.Note;
import org.springframework.stereotype.Component;

@Component
public class NoteMapper {

    public Note toModelObject(NoteDto noteDto) {
        return Note.valueOf(noteDto.name());
    }

    public NoteDto toDtoObject(Note note) {
        return NoteDto.valueOf(note.name());
    }


}
