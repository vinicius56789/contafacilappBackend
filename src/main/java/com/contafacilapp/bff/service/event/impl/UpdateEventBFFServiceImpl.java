package com.contafacilapp.bff.service.event.impl;

import com.contafacilapp.bff.dto.event.EventDTO;
import com.contafacilapp.bff.dto.event.UpdateEventBFFResponseDTO;
import com.contafacilapp.bff.mapper.event.UpdateEventBFFRequestMapper;
import com.contafacilapp.bff.mapper.event.UpdateEventBFFResponseMapper;
import com.contafacilapp.bff.service.event.UpdateEventBFFService;
import com.contafacilapp.bs.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateEventBFFServiceImpl implements UpdateEventBFFService {

    @Autowired
    private EventService eventService;

    @Override
    public UpdateEventBFFResponseDTO updateEventBFFService(EventDTO eventDTO) {

        return new UpdateEventBFFResponseMapper(
                eventService.updateEvent(
                        new UpdateEventBFFRequestMapper(eventDTO)
                                .toBusinessDTO())).toFrontEndDTO();
    }
}
