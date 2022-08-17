package com.contafacilapp.bff.service.event;

import com.contafacilapp.bff.dto.event.EventDTO;
import com.contafacilapp.bff.dto.event.SelectEventBFFResponseDTO;

public interface SelectEventBFFService {

    SelectEventBFFResponseDTO selectEventBFFService(EventDTO eventDTO);

}
