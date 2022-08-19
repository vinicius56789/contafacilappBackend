package com.contafacilapp.bff.service.event.impl;

import com.contafacilapp.bff.dto.event.EventDTO;
import com.contafacilapp.bff.dto.event.SelectAllEventsBFFResponseDTO;
import com.contafacilapp.bff.mapper.event.SelectAllEventsBFFRequestMapper;
import com.contafacilapp.bff.mapper.event.SelectAllEventsBFFResponseMapper;
import com.contafacilapp.bff.service.event.SelectAllEventsBFFService;
import com.contafacilapp.bs.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SelectAllEventsBFFServiceImpl implements SelectAllEventsBFFService {

    @Autowired
    private EventService eventService;

    @Override
    public SelectAllEventsBFFResponseDTO selectAllEventsBFFService(EventDTO eventDTO) {

        return new SelectAllEventsBFFResponseMapper(
                eventService.selectAllEvents(
                        new SelectAllEventsBFFRequestMapper(eventDTO)
                                .toBusinessDTO())).toFrontEndDTO();
    }
}
