package com.contafacilapp.repository.impl;

import com.contafacilapp.model.Bill;
import com.contafacilapp.model.Event;
import com.contafacilapp.repository.EventRepositoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.List;

@Service
public class EventRepositoryServiceImpl implements EventRepositoryService {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Event> selectAllEvents(Event event) {

        String query = "select e from event e where e.client = :client";

        return entityManager.createQuery(query, Event.class)
                .setParameter("client", event.getClient())
                .getResultList();
    }

    @Override
    public Event selectEvent(Event event) {

        String query = "select e from event e where e.id = :id";

        return entityManager.createQuery(query, Event.class)
                .setParameter("id", event.getId())
                .getSingleResult();
    }

    @Override
    public List<Bill> selectBillsFromEvent(Event event) {

        String query = "select b from bill b where b.event = :event";

        return entityManager.createQuery(query, Bill.class)
                .setParameter("event", event.getId())
                .getResultList();
    }

    @Override
    public int insertEvent(Event event) {

        try {

            entityManager.persist(event);

            return 1;

        } catch (Exception e) {
            return 0;
        }
    }

    @Override
    public int updateEvent(Event event) {

        String query = "update event e set e.name = :name, e.description = :description where e.id = :id";

        return entityManager.createQuery(query)
                .setParameter("name", event.getName())
                .setParameter("description", event.getDescription())
                .setParameter("id", event.getId())
                .executeUpdate();
    }

    @Override
    public int deleteEvent(Event event) {

        String query = "delete from event where id = :id";

        return entityManager.createQuery(query)
                .setParameter("id", event.getId())
                .executeUpdate();
    }
}
