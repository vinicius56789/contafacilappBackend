package com.contafacilapp.bff.service.impl.event;

import com.contafacilapp.bff.dto.event.EventDTO;
import com.contafacilapp.bff.service.event.impl.SelectEventBFFServiceImpl;
import com.contafacilapp.bs.EventService;
import com.contafacilapp.model.Event;
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
public class SelectEventBFFServiceImplTest {

    @Mock
    private EventService eventService;

    @InjectMocks
    private SelectEventBFFServiceImpl service;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void selectEventBFFServiceTest() {

        EventDTO eventDTO = new EventDTO();
        eventDTO.setEventId("1");

        Event event = new Event();

        Mockito.when(eventService.selectEvent(Mockito.any())).thenReturn(event);

        Assertions.assertNotNull(service.selectEventBFFService(eventDTO));
    }
}
