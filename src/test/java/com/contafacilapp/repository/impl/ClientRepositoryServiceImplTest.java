package com.contafacilapp.repository.impl;

import com.contafacilapp.model.Client;
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

@ExtendWith(MockitoExtension.class)
public class ClientRepositoryServiceImplTest {

    @Mock
    private EntityManager entityManager;

    @InjectMocks
    private ClientRepositoryServiceImpl gateway;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void searchClientTest() {

        Client client = new Client();

        Query query = Mockito.mock(Query.class);

        Mockito.when(entityManager.createQuery(Mockito.any(), Mockito.any())).thenReturn(query);
        Mockito.when(query.setParameter("email", client.getEmail())).thenReturn(query);
        Mockito.when(query.setParameter("password", client.getPassword())).thenReturn(query);
        Mockito.when(query.getSingleResult()).thenReturn(client);

        Assertions.assertNotNull(gateway.searchClient(client));
    }

    @Test
    void insertClientTest() {

        Client client = new Client();

        Assertions.assertNotNull(gateway.insertClient(client));
    }

    @Test
    void updateClientTest() {

        Client client = new Client();
        client.setId(1L);
        client.setOccupation("dev");
        client.setAge("22");
        client.setName("Vinicius");

        Query query = Mockito.mock(Query.class);

        Mockito.when(entityManager.createQuery("update client c set c.name = :name, c.age = :age, c.occupation = :occupation where c.id = :id")).thenReturn(query);
        Mockito.when(query.setParameter("name", client.getName())).thenReturn(query);
        Mockito.when(query.setParameter("age", client.getAge())).thenReturn(query);
        Mockito.when(query.setParameter("occupation", client.getOccupation())).thenReturn(query);
        Mockito.when(query.setParameter("id", client.getId())).thenReturn(query);

        Assertions.assertNotNull(gateway.updateClient(client));
    }
}
