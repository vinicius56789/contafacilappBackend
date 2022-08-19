package com.contafacilapp.bff.mapper.event;

import com.contafacilapp.bff.dto.event.EventDTO;
import com.contafacilapp.bff.dto.event.SelectEventBFFResponseDTO;
import com.contafacilapp.model.Event;

public class SelectEventBFFResponseMapper {

    private SelectEventBFFResponseDTO responseBFF = new SelectEventBFFResponseDTO();

    public SelectEventBFFResponseMapper(Event selectEvent) {

        EventDTO event = new EventDTO();
        event.setName(selectEvent.getName());
        event.setDescription(selectEvent.getDescription());

        responseBFF.setContent(event);
    }

    public SelectEventBFFResponseDTO toFrontEndDTO() {
        return responseBFF;
    }
}
