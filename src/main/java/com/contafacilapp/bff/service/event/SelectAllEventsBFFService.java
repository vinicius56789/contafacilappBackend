package com.contafacilapp.bff.service.event;

import com.contafacilapp.bff.dto.event.EventDTO;
import com.contafacilapp.bff.dto.event.SelectAllEventsBFFResponseDTO;

public interface SelectAllEventsBFFService {

    SelectAllEventsBFFResponseDTO selectAllEventsBFFService(EventDTO eventDTO);
}
