package com.contafacilapp.bff.service.impl.client;

import com.contafacilapp.bff.dto.client.ClientDTO;
import com.contafacilapp.bff.service.client.impl.SearchClientBFFServiceImpl;
import com.contafacilapp.bs.ClientService;
import com.contafacilapp.model.Client;
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
public class SearchClientBFFServiceImplTest {

    @Mock
    private ClientService clientService;

    @InjectMocks
    private SearchClientBFFServiceImpl service;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void searchClientBFFServiceTest() {

        ClientDTO clientDTO = new ClientDTO();
        clientDTO.setEmail("abc@abc");

        Client client = new Client();
        client.setId(1L);

        Mockito.when(clientService.searchClient(Mockito.any())).thenReturn(client);

        Assertions.assertNotNull(service.searchClientBFFService(clientDTO));
    }
}
