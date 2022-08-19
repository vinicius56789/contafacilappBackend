package com.contafacilapp.bff.mapper.event;

import com.contafacilapp.bff.dto.event.EventDTO;
import com.contafacilapp.model.Client;
import com.contafacilapp.model.Event;

public class SelectAllEventsBFFRequestMapper {

    private Event requestBS = new Event();

    public SelectAllEventsBFFRequestMapper(EventDTO eventDTO) {

        Client client = new Client();
        client.setId(Long.valueOf(eventDTO.getClientId()));
        requestBS.setClient(client);

    }

    public Event toBusinessDTO() {
        return requestBS;
    }
}
