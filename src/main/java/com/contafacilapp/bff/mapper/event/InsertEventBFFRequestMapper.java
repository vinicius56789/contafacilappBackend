package com.contafacilapp.bff.mapper.event;

import com.contafacilapp.bff.dto.bill.BillDTO;
import com.contafacilapp.bff.dto.event.EventDTO;
import com.contafacilapp.model.Bill;
import com.contafacilapp.model.Client;
import com.contafacilapp.model.Event;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class InsertEventBFFRequestMapper {

    private Event requestBS = new Event();

    public InsertEventBFFRequestMapper(EventDTO eventDTO) {

        Set<Bill> bills = new HashSet<>();

        for(BillDTO bill : eventDTO.getBills()) {

            Bill item = new Bill();
            item.setId(Long.valueOf(bill.getBillId()));
            bills.add(item);
        }

        requestBS.setBills(bills);

        Client client = new Client();
        client.setId(Long.valueOf(eventDTO.getClientId()));
        requestBS.setClient(client);
        requestBS.setDescription(eventDTO.getDescription());
        requestBS.setName(eventDTO.getName());
    }

    public Event toBusinessDTO() {
        return requestBS;
    }
}
