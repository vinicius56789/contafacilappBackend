package com.contafacilapp.bs;

import com.contafacilapp.model.Bill;
import com.contafacilapp.model.Event;

import java.util.List;

public interface EventService {

    List<Event> selectAllEvents(Event event);

    Event selectEvent(Event event);

    List<Bill> selectBillsFromEvent(Event event);

    int insertEvent(Event event);

    int updateEvent(Event event);

    int deleteEvent(Event event);
}
