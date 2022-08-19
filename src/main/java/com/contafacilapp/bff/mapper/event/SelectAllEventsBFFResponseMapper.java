package com.contafacilapp.bff.mapper.event;

import com.contafacilapp.bff.dto.event.EventDTO;
import com.contafacilapp.bff.dto.event.SelectAllEventsBFFResponseDTO;
import com.contafacilapp.model.Event;

import java.util.ArrayList;
import java.util.List;

public class SelectAllEventsBFFResponseMapper {

    private SelectAllEventsBFFResponseDTO responseBFF = new SelectAllEventsBFFResponseDTO();

    public SelectAllEventsBFFResponseMapper(List<Event> selectAllEvents) {

        List<EventDTO> content = new ArrayList<>();

        for(Event event : selectAllEvents) {

            EventDTO item = new EventDTO();
            item.setEventId(String.valueOf(event.getId()));
            item.setDescription(event.getDescription());
            item.setName(event.getName());
            content.add(item);

        }

        responseBFF.setContent(content);

    }

    public SelectAllEventsBFFResponseDTO toFrontEndDTO() {
        return responseBFF;
    }
}
