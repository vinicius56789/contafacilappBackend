package com.contafacilapp.controller;

import com.contafacilapp.bff.dto.bill.SelectBillBFFResponseDTO;
import com.contafacilapp.bff.dto.event.*;
import com.contafacilapp.bff.service.event.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/event")
public class EventController {

    @Autowired
    private DeleteEventBFFService deleteEventBFFService;

    @Autowired
    private InsertEventBFFService insertEventBFFService;

    @Autowired
    private SelectAllEventsBFFService selectAllEventsBFFService;

    @Autowired
    private SelectBillsFromEventBFFService selectBillsFromEventBFFService;

    @Autowired
    private SelectEventBFFService selectEventBFFService;

    @Autowired
    private UpdateEventBFFService updateEventBFFService;

    @PostMapping("/delete")
    public DeleteEventBFFResponseDTO deleteEvent(@RequestBody EventDTO eventDTO) {
        return deleteEventBFFService.deleteEventBFFService(eventDTO);
    }

    @PostMapping("/insert")
    public InsertEventBFFResponseDTO insertEvent(@RequestBody EventDTO eventDTO) {
        return insertEventBFFService.insertEventBFFService(eventDTO);
    }

    @PostMapping("/list")
    public SelectAllEventsBFFResponseDTO selectAllEvents(@RequestBody EventDTO eventDTO) {
        return selectAllEventsBFFService.selectAllEventsBFFService(eventDTO);
    }

    @PostMapping("/bills_event")
    public SelectBillsFromEventBFFResponseDTO selectBillsFromEvent(@RequestBody EventDTO eventDTO) {
        return selectBillsFromEventBFFService.selectBillsFromEventBFFService(eventDTO);
    }

    @PostMapping("/details")
    public SelectEventBFFResponseDTO selectEvent(@RequestBody EventDTO eventDTO) {
        return selectEventBFFService.selectEventBFFService(eventDTO);
    }

    @PostMapping("/update")
    public UpdateEventBFFResponseDTO updateEvent(@RequestBody EventDTO eventDTO) {
        return updateEventBFFService.updateEventBFFService(eventDTO);
    }

}
