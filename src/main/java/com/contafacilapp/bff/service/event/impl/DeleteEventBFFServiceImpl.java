package com.contafacilapp.bff.service.event.impl;

import com.contafacilapp.bff.dto.event.DeleteEventBFFResponseDTO;
import com.contafacilapp.bff.dto.event.EventDTO;
import com.contafacilapp.bff.mapper.event.DeleteEventBFFRequestMapper;
import com.contafacilapp.bff.mapper.event.DeleteEventBFFResponseMapper;
import com.contafacilapp.bff.service.event.DeleteEventBFFService;
import com.contafacilapp.bs.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteEventBFFServiceImpl implements DeleteEventBFFService {

    @Autowired
    private EventService eventService;

    @Override
    public DeleteEventBFFResponseDTO deleteEventBFFService(EventDTO eventDTO) {

        return new DeleteEventBFFResponseMapper(
                eventService.deleteEvent(
                        new DeleteEventBFFRequestMapper(eventDTO)
                                .toBusinessDTO())).toFrontEndDTO();
    }
}
