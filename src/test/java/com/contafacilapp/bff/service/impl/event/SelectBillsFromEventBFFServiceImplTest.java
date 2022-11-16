package com.contafacilapp.bff.service.impl.event;

import com.contafacilapp.bff.dto.event.EventDTO;
import com.contafacilapp.bff.service.event.impl.SelectBillsFromEventBFFServiceImpl;
import com.contafacilapp.bs.EventService;
import com.contafacilapp.model.Bill;
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
public class SelectBillsFromEventBFFServiceImplTest {

    @Mock
    private EventService eventService;

    @InjectMocks
    private SelectBillsFromEventBFFServiceImpl service;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void selectBillsFromEventBFFServiceTest() {

        EventDTO eventDTO = new EventDTO();
        eventDTO.setEventId("1");

        List<Bill> bills = new ArrayList<>();
        Bill bill = new Bill();
        bills.add(bill);

        Mockito.when(eventService.selectBillsFromEvent(Mockito.any())).thenReturn(bills);

        Assertions.assertNotNull(service.selectBillsFromEventBFFService(eventDTO));
    }
}
