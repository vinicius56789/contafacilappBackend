package com.contafacilapp.bff.service.impl.event;

import com.contafacilapp.bff.dto.event.EventDTO;
import com.contafacilapp.bff.service.event.impl.SelectAllEventsBFFServiceImpl;
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

import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class SelectAllEventsBFFServiceImplTest {

    @Mock
    private EventService eventService;

    @InjectMocks
    private SelectAllEventsBFFServiceImpl service;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void selectAllEventsBFFServiceTest() {

        EventDTO eventDTO = new EventDTO();
        eventDTO.setClientId("1");

        List<Event> events = new ArrayList<>();
        Event event = new Event();
        events.add(event);

        Mockito.when(eventService.selectAllEvents(Mockito.any())).thenReturn(events);

        Assertions.assertNotNull(service.selectAllEventsBFFService(eventDTO));
    }
}
