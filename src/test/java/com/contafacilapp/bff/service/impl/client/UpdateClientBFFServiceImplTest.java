package com.contafacilapp.bff.service.impl.client;

import com.contafacilapp.bff.dto.client.ClientDTO;
import com.contafacilapp.bff.service.client.impl.UpdateClientBFFServiceImpl;
import com.contafacilapp.bs.ClientService;
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
public class UpdateClientBFFServiceImplTest {

    @Mock
    private ClientService clientService;

    @InjectMocks
    private UpdateClientBFFServiceImpl service;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void updateClientBFFServiceSuccessTest() {

        ClientDTO clientDTO = new ClientDTO();
        clientDTO.setClientId("1");

        Mockito.when(clientService.updateClient(Mockito.any())).thenReturn(1);

        Assertions.assertNotNull(service.updateClientBFFService(clientDTO));
    }

    @Test
    void updateClientBFFServiceErrorTest() {

        ClientDTO clientDTO = new ClientDTO();
        clientDTO.setClientId("1");

        Mockito.when(clientService.updateClient(Mockito.any())).thenReturn(0);

        Assertions.assertNotNull(service.updateClientBFFService(clientDTO));
    }
}
