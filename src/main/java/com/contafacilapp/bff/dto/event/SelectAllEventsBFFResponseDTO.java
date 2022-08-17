package com.contafacilapp.bff.dto.event;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SelectAllEventsBFFResponseDTO {

    private List<EventDTO> content;

}
