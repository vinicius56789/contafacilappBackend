package com.contafacilapp.bff.service.event;

import com.contafacilapp.bff.dto.event.EventDTO;
import com.contafacilapp.bff.dto.event.UpdateEventBFFResponseDTO;

public interface UpdateEventBFFService {

    UpdateEventBFFResponseDTO updateEventBFFService(EventDTO eventDTO);
}
