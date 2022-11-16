package com.contafacilapp.repository.impl;

import com.contafacilapp.model.Bill;
import com.contafacilapp.model.Client;
import com.contafacilapp.model.Event;
import org.hibernate.query.Query;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class EventRepositoryServiceImplTest {

    @Mock
    private EntityManager entityManager;

    @InjectMocks
    private EventRepositoryServiceImpl gateway;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void selectAllEventsTest() {

        Event event = new Event();

        Client client = new Client();
        client.setId(1L);

        event.setClient(client);

        List<Event> events = new ArrayList<>();

        Query query = Mockito.mock(Query.class);

        Mockito.when(entityManager.createQuery(Mockito.any(), Mockito.any())).thenReturn(query);
        Mockito.when(query.setParameter("client", event.getClient())).thenReturn(query);
        Mockito.when(query.getResultList()).thenReturn(events);

        Assertions.assertNotNull(gateway.selectAllEvents(event));
    }

    @Test
    void selectEventTest() {

        Event event = new Event();
        event.setId(1L);

        Query query = Mockito.mock(Query.class);

        Mockito.when(entityManager.createQuery(Mockito.any(), Mockito.any())).thenReturn(query);
        Mockito.when(query.setParameter("id", event.getId())).thenReturn(query);
        Mockito.when(query.getSingleResult()).thenReturn(event);

        Assertions.assertNotNull(gateway.selectEvent(event));
    }

    @Test
    void selectBillsFromEventTest() {

        Event event = new Event();
        event.setId(1L);

        List<Bill> bills = new ArrayList<>();

        Query query = Mockito.mock(Query.class);

        Mockito.when(entityManager.createQuery(Mockito.any(), Mockito.any())).thenReturn(query);
        Mockito.when(query.setParameter("event", event.getId())).thenReturn(query);
        Mockito.when(query.getResultList()).thenReturn(bills);

        Assertions.assertNotNull(gateway.selectBillsFromEvent(event));
    }

    @Test
    void insertEventTest() {

        Event event = new Event();

        Assertions.assertNotNull(gateway.insertEvent(event));
    }

    @Test
    void updateEventTest() {

        Event event = new Event();
        event.setName("evento1");
        event.setDescription("descricao");
        event.setId(1L);

        Query query = Mockito.mock(Query.class);

        Mockito.when(entityManager.createQuery("update event e set e.name = :name, e.description = :description where e.id = :id")).thenReturn(query);
        Mockito.when(query.setParameter("name", event.getName())).thenReturn(query);
        Mockito.when(query.setParameter("description", event.getDescription())).thenReturn(query);
        Mockito.when(query.setParameter("id", event.getId())).thenReturn(query);
        Mockito.when(query.executeUpdate()).thenReturn(1);

        Assertions.assertNotNull(gateway.updateEvent(event));
    }

    @Test
    void deleteEventTest() {

        Event event = new Event();
        event.setId(1L);

        Query query = Mockito.mock(Query.class);

        Mockito.when(entityManager.createQuery("delete from event where id = :id")).thenReturn(query);
        Mockito.when(query.setParameter("id", event.getId())).thenReturn(query);
        Mockito.when(query.executeUpdate()).thenReturn(1);

        gateway.deleteEvent(event);
    }

}
