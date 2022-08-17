package com.contafacilapp.bff.service.event;

import com.contafacilapp.bff.dto.event.EventDTO;
import com.contafacilapp.bff.dto.event.InsertEventBFFResponseDTO;

public interface InsertEventBFFService {

    InsertEventBFFResponseDTO insertEventBFFService(EventDTO eventDTO);

}
