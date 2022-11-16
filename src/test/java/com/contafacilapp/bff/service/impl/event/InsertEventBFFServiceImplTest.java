package com.contafacilapp.bff.service.impl.event;

import com.contafacilapp.bff.dto.bill.BillDTO;
import com.contafacilapp.bff.dto.event.EventDTO;
import com.contafacilapp.bff.service.event.impl.InsertEventBFFServiceImpl;
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

import java.util.HashSet;
import java.util.Set;

@ExtendWith(MockitoExtension.class)
public class InsertEventBFFServiceImplTest {

    @Mock
    private EventService eventService;

    @InjectMocks
    private InsertEventBFFServiceImpl service;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void insertEventBFFServiceSuccessTest() {

        EventDTO eventDTO = new EventDTO();
        eventDTO.setClientId("1");

        Set<BillDTO> bills = new HashSet<>();
        BillDTO bill = new BillDTO();
        bill.setBillId("1");
        bills.add(bill);
        eventDTO.setBills(bills);

        Mockito.when(eventService.insertEvent(Mockito.any())).thenReturn(1);

        Assertions.assertNotNull(service.insertEventBFFService(eventDTO));
    }

    @Test
    void insertEventBFFServiceErrorTest() {

        EventDTO eventDTO = new EventDTO();
        eventDTO.setClientId("1");

        Set<BillDTO> bills = new HashSet<>();
        BillDTO bill = new BillDTO();
        bill.setBillId("1");
        bills.add(bill);
        eventDTO.setBills(bills);

        Mockito.when(eventService.insertEvent(Mockito.any())).thenReturn(0);

        Assertions.assertNotNull(service.insertEventBFFService(eventDTO));
    }
}
