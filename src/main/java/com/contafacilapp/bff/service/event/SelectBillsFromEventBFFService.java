package com.contafacilapp.bff.service.event;

import com.contafacilapp.bff.dto.event.EventDTO;
import com.contafacilapp.bff.dto.event.SelectBillsFromEventBFFResponseDTO;

public interface SelectBillsFromEventBFFService {

    SelectBillsFromEventBFFResponseDTO selectBillsFromEventBFFService(EventDTO eventDTO);

}
