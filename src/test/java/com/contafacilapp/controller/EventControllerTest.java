package com.contafacilapp.controller;

import com.contafacilapp.bff.dto.event.*;
import com.contafacilapp.bff.service.event.*;
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
public class EventControllerTest {

    @Mock
    private DeleteEventBFFService deleteEventBFFService;

    @Mock
    private InsertEventBFFService insertEventBFFService;

    @Mock
    private SelectAllEventsBFFService selectAllEventsBFFService;

    @Mock
    private SelectBillsFromEventBFFService selectBillsFromEventBFFService;

    @Mock
    private SelectEventBFFService selectEventBFFService;

    @Mock
    private UpdateEventBFFService updateEventBFFService;

    @InjectMocks
    private EventController controller;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void deleteEventTest() {

        EventDTO eventDTO = new EventDTO();

        DeleteEventBFFResponseDTO deleteEventBFFResponseDTO = new DeleteEventBFFResponseDTO();

        Mockito.when(deleteEventBFFService.deleteEventBFFService(Mockito.any())).thenReturn(deleteEventBFFResponseDTO);

        Assertions.assertNotNull(controller.deleteEvent(eventDTO));
    }

    @Test
    void insertEventTest() {

        EventDTO eventDTO = new EventDTO();

        InsertEventBFFResponseDTO deleteEventBFFResponseDTO = new InsertEventBFFResponseDTO();

        Mockito.when(insertEventBFFService.insertEventBFFService(Mockito.any())).thenReturn(deleteEventBFFResponseDTO);

        Assertions.assertNotNull(controller.insertEvent(eventDTO));
    }

    @Test
    void selectAllEventsTest() {

        EventDTO eventDTO = new EventDTO();

        SelectAllEventsBFFResponseDTO deleteEventBFFResponseDTO = new SelectAllEventsBFFResponseDTO();

        Mockito.when(selectAllEventsBFFService.selectAllEventsBFFService(Mockito.any())).thenReturn(deleteEventBFFResponseDTO);

        Assertions.assertNotNull(controller.selectAllEvents(eventDTO));
    }

    @Test
    void selectBillsFromEventTest() {

        EventDTO eventDTO = new EventDTO();

        SelectBillsFromEventBFFResponseDTO deleteEventBFFResponseDTO = new SelectBillsFromEventBFFResponseDTO();

        Mockito.when(selectBillsFromEventBFFService.selectBillsFromEventBFFService(Mockito.any())).thenReturn(deleteEventBFFResponseDTO);

        Assertions.assertNotNull(controller.selectBillsFromEvent(eventDTO));
    }

    @Test
    void selectEventTest() {

        EventDTO eventDTO = new EventDTO();

        SelectEventBFFResponseDTO deleteEventBFFResponseDTO = new SelectEventBFFResponseDTO();

        Mockito.when(selectEventBFFService.selectEventBFFService(Mockito.any())).thenReturn(deleteEventBFFResponseDTO);

        Assertions.assertNotNull(controller.selectEvent(eventDTO));
    }

    @Test
    void updateEventTest() {

        EventDTO eventDTO = new EventDTO();

        UpdateEventBFFResponseDTO deleteEventBFFResponseDTO = new UpdateEventBFFResponseDTO();

        Mockito.when(updateEventBFFService.updateEventBFFService(Mockito.any())).thenReturn(deleteEventBFFResponseDTO);

        Assertions.assertNotNull(controller.updateEvent(eventDTO));
    }
}
