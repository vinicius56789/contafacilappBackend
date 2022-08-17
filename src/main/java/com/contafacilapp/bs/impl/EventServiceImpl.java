package com.contafacilapp.bs.impl;

import com.contafacilapp.bs.EventService;
import com.contafacilapp.model.Bill;
import com.contafacilapp.model.Event;
import com.contafacilapp.repository.EventRepositoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventServiceImpl implements EventService {

    @Autowired
    private EventRepositoryService gateway;

    @Override
    public List<Event> selectAllEvents(Event event) {
        return gateway.selectAllEvents(event);
    }

    @Override
    public Event selectEvent(Event event) {
        return gateway.selectEvent(event);
    }

    @Override
    public List<Bill> selectBillsFromEvent(Event event) {
        return gateway.selectBillsFromEvent(event);
    }

    @Override
    public int insertEvent(Event event) {
        return gateway.insertEvent(event);
    }

    @Override
    public int updateEvent(Event event) {
        return gateway.updateEvent(event);
    }

    @Override
    public int deleteEvent(Event event) {
        return gateway.deleteEvent(event);
    }
}
