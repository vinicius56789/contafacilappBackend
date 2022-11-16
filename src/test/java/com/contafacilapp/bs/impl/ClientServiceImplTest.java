package com.contafacilapp.bs.impl;

import com.contafacilapp.model.Client;
import com.contafacilapp.repository.ClientRepositoryService;
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
public class ClientServiceImplTest {

    @Mock
    private ClientRepositoryService gateway;

    @InjectMocks
    private ClientServiceImpl service;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void searchClientTest() {

        Client client = new Client();

        Mockito.when(gateway.searchClient(Mockito.any())).thenReturn(client);

        Assertions.assertNotNull(service.searchClient(client));
    }

    @Test
    void insertClientTest() {

        Client client = new Client();

        Mockito.when(gateway.insertClient(Mockito.any())).thenReturn(1);

        Assertions.assertNotNull(service.insertClient(client));
    }

    @Test
    void updateClientTest() {

        Client client = new Client();

        Mockito.when(gateway.updateClient(Mockito.any())).thenReturn(1);

        Assertions.assertNotNull(service.updateClient(client));
    }
}
