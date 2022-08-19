package com.contafacilapp.bff.service.event.impl;

import com.contafacilapp.bff.dto.event.EventDTO;
import com.contafacilapp.bff.dto.event.SelectBillsFromEventBFFResponseDTO;
import com.contafacilapp.bff.mapper.event.SelectBillsFromEventBFFRequestMapper;
import com.contafacilapp.bff.mapper.event.SelectBillsFromEventBFFResponseMapper;
import com.contafacilapp.bff.service.event.SelectBillsFromEventBFFService;
import com.contafacilapp.bs.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SelectBillsFromEventBFFServiceImpl implements SelectBillsFromEventBFFService {

    @Autowired
    private EventService eventService;

    @Override
    public SelectBillsFromEventBFFResponseDTO selectBillsFromEventBFFService(EventDTO eventDTO) {

        return new SelectBillsFromEventBFFResponseMapper(
                eventService.selectBillsFromEvent(
                        new SelectBillsFromEventBFFRequestMapper(eventDTO)
                                .toBusinessDTO())).toFrontEndDTO();
    }
}
