package com.contafacilapp.bff.service.impl.event;

import com.contafacilapp.bff.dto.event.EventDTO;
import com.contafacilapp.bff.service.event.impl.UpdateEventBFFServiceImpl;
import com.contafacilapp.bs.EventService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class UpdateEventBFFServiceImplTest {

    @Mock
    private EventService eventService;

    @InjectMocks
    private UpdateEventBFFServiceImpl service;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void updateEventBFFServiceSuccessTest() {

        EventDTO eventDTO = new EventDTO();
        eventDTO.setEventId("1");

        Mockito.when(eventService.updateEvent(Mockito.any())).thenReturn(1);

        Assertions.assertNotNull(service.updateEventBFFService(eventDTO));
    }

    @Test
    void updateEventBFFServiceErrorTest() {

        EventDTO eventDTO = new EventDTO();
        eventDTO.setEventId("1");

        Mockito.when(eventService.updateEvent(Mockito.any())).thenReturn(0);

        Assertions.assertNotNull(service.updateEventBFFService(eventDTO));
    }
}
