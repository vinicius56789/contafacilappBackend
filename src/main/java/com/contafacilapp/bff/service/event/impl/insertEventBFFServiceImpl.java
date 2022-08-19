package com.contafacilapp.bff.service.event.impl;

import com.contafacilapp.bff.dto.event.EventDTO;
import com.contafacilapp.bff.dto.event.InsertEventBFFResponseDTO;
import com.contafacilapp.bff.mapper.event.InsertEventBFFRequestMapper;
import com.contafacilapp.bff.mapper.event.InsertEventBFFResponseMapper;
import com.contafacilapp.bff.service.event.InsertEventBFFService;
import com.contafacilapp.bs.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class insertEventBFFServiceImpl implements InsertEventBFFService{

    @Autowired
    private EventService eventService;

    @Override
    public InsertEventBFFResponseDTO insertEventBFFService(EventDTO eventDTO) {

        return new InsertEventBFFResponseMapper(
                eventService.insertEvent(
                        new InsertEventBFFRequestMapper(eventDTO)
                                .toBusinessDTO())).toFrontEndDTO();
    }
}
