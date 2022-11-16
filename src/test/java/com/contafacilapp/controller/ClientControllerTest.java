package com.contafacilapp.controller;

import com.contafacilapp.bff.dto.client.ClientDTO;
import com.contafacilapp.bff.dto.client.InsertClientBFFResponseDTO;
import com.contafacilapp.bff.dto.client.SearchClientBFFResponseDTO;
import com.contafacilapp.bff.dto.client.UpdateClientBFFResponseDTO;
import com.contafacilapp.bff.service.client.InsertClientBFFService;
import com.contafacilapp.bff.service.client.SearchClientBFFService;
import com.contafacilapp.bff.service.client.UpdateClientBFFService;
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
public class ClientControllerTest {

    @Mock
    private InsertClientBFFService insertClientBFFService;

    @Mock
    private SearchClientBFFService searchClientBFFService;

    @Mock
    private UpdateClientBFFService updateClientBFFService;

    @InjectMocks
    private ClientController clientController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void insertClientTest() {

        ClientDTO clientDTO = new ClientDTO();

        InsertClientBFFResponseDTO insertClientBFFResponseDTO = new InsertClientBFFResponseDTO();

        Mockito.when(insertClientBFFService.insertClientBFFService(Mockito.any())).thenReturn(insertClientBFFResponseDTO);

        Assertions.assertNotNull(clientController.insertClient(clientDTO));
    }

    @Test
    void searchClientTest() {

        ClientDTO clientDTO = new ClientDTO();

        SearchClientBFFResponseDTO insertClientBFFResponseDTO = new SearchClientBFFResponseDTO();

        Mockito.when(searchClientBFFService.searchClientBFFService(Mockito.any())).thenReturn(insertClientBFFResponseDTO);

        Assertions.assertNotNull(clientController.searchClient(clientDTO));
    }

    @Test
    void updateClientTest() {

        ClientDTO clientDTO = new ClientDTO();

        UpdateClientBFFResponseDTO insertClientBFFResponseDTO = new UpdateClientBFFResponseDTO();

        Mockito.when(updateClientBFFService.updateClientBFFService(Mockito.any())).thenReturn(insertClientBFFResponseDTO);

        Assertions.assertNotNull(clientController.updateClient(clientDTO));
    }

}
