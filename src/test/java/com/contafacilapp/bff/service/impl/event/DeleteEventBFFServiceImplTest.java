package com.contafacilapp.bff.service.impl.event;

import com.contafacilapp.bff.dto.event.EventDTO;
import com.contafacilapp.bff.service.event.impl.DeleteEventBFFServiceImpl;
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
public class DeleteEventBFFServiceImplTest {

    @Mock
    private EventService eventService;

    @InjectMocks
    private DeleteEventBFFServiceImpl service;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void deleteEventBFFServiceSuccessTest() {

        EventDTO eventDTO = new EventDTO();
        eventDTO.setEventId("1");

        Mockito.when(eventService.deleteEvent(Mockito.any())).thenReturn(1);

        Assertions.assertNotNull(service.deleteEventBFFService(eventDTO));
    }

    @Test
    void deleteEventBFFServiceErrorTest() {

        EventDTO eventDTO = new EventDTO();
        eventDTO.setEventId("1");

        Mockito.when(eventService.deleteEvent(Mockito.any())).thenReturn(0);

        Assertions.assertNotNull(service.deleteEventBFFService(eventDTO));
    }
}
