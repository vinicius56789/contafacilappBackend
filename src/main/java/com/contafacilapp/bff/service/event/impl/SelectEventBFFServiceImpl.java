package com.contafacilapp.bff.service.event.impl;

import com.contafacilapp.bff.dto.event.EventDTO;
import com.contafacilapp.bff.dto.event.SelectEventBFFResponseDTO;
import com.contafacilapp.bff.mapper.event.SelectEventBFFRequestMapper;
import com.contafacilapp.bff.mapper.event.SelectEventBFFResponseMapper;
import com.contafacilapp.bff.service.event.SelectEventBFFService;
import com.contafacilapp.bs.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SelectEventBFFServiceImpl implements SelectEventBFFService {

    @Autowired
    private EventService eventService;

    @Override
    public SelectEventBFFResponseDTO selectEventBFFService(EventDTO eventDTO) {

        return new SelectEventBFFResponseMapper(
                eventService.selectEvent(
                        new SelectEventBFFRequestMapper(eventDTO)
                                .toBusinessDTO())).toFrontEndDTO();
    }
}
