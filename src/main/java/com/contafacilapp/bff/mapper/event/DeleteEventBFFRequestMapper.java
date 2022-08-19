package com.contafacilapp.bff.mapper.event;

import com.contafacilapp.bff.dto.event.EventDTO;
import com.contafacilapp.model.Event;

public class DeleteEventBFFRequestMapper {

    private Event requestBS = new Event();

    public DeleteEventBFFRequestMapper(EventDTO eventDTO) {

        requestBS.setId(Long.valueOf(eventDTO.getEventId()));

    }

    public Event toBusinessDTO() {
        return requestBS;
    }
}
