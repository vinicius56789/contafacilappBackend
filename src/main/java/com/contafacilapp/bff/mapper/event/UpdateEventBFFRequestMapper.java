package com.contafacilapp.bff.mapper.event;

import com.contafacilapp.bff.dto.event.EventDTO;
import com.contafacilapp.model.Event;

public class UpdateEventBFFRequestMapper {

    private Event requestBS = new Event();

    public UpdateEventBFFRequestMapper(EventDTO eventDTO) {

        requestBS.setName(eventDTO.getName());
        requestBS.setDescription(eventDTO.getDescription());

    }

    public Event toBusinessDTO() {
        return requestBS;
    }
}
