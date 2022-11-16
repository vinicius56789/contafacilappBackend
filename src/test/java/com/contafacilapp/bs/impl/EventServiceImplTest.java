package com.contafacilapp.bs.impl;

import com.contafacilapp.model.Bill;
import com.contafacilapp.model.Event;
import com.contafacilapp.repository.EventRepositoryService;
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
public class EventServiceImplTest {

    @Mock
    private EventRepositoryService gateway;

    @InjectMocks
    private EventServiceImpl service;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void selectAllEventsTest() {

        Event event = new Event();

        List<Event> events = new ArrayList<>();

        Mockito.when(gateway.selectAllEvents(Mockito.any())).thenReturn(events);

        Assertions.assertNotNull(service.selectAllEvents(event));
    }

    @Test
    void selectEventTest() {

        Event event = new Event();

        Mockito.when(gateway.selectEvent(Mockito.any())).thenReturn(event);

        Assertions.assertNotNull(service.selectEvent(event));
    }

    @Test
    void selectBillsFromEventTest() {

        Event event = new Event();

        List<Bill> events = new ArrayList<>();

        Mockito.when(gateway.selectBillsFromEvent(Mockito.any())).thenReturn(events);

        Assertions.assertNotNull(service.selectBillsFromEvent(event));
    }

    @Test
    void insertEventTest() {

        Event event = new Event();

        Mockito.when(gateway.insertEvent(Mockito.any())).thenReturn(1);

        Assertions.assertNotNull(service.insertEvent(event));
    }

    @Test
    void updateEventTest() {

        Event event = new Event();

        Mockito.when(gateway.updateEvent(Mockito.any())).thenReturn(1);

        Assertions.assertNotNull(service.updateEvent(event));
    }

    @Test
    void deleteEventTest() {

        Event event = new Event();

        Mockito.when(gateway.deleteEvent(Mockito.any())).thenReturn(1);

        Assertions.assertNotNull(service.deleteEvent(event));
    }
}
