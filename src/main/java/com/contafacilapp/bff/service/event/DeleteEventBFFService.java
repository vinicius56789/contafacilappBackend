package com.contafacilapp.bff.service.event;

import com.contafacilapp.bff.dto.event.DeleteEventBFFResponseDTO;
import com.contafacilapp.bff.dto.event.EventDTO;

public interface DeleteEventBFFService {

    DeleteEventBFFResponseDTO deleteEventBFFService(EventDTO eventDTO);

}
