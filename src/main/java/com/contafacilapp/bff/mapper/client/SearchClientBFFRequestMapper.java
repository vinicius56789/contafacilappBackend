package com.contafacilapp.bff.mapper.client;

import com.contafacilapp.bff.dto.client.ClientDTO;
import com.contafacilapp.model.Client;

public class SearchClientBFFRequestMapper {

    private Client requestBS = new Client();

    public SearchClientBFFRequestMapper(ClientDTO clientDTO) {

        requestBS.setEmail(clientDTO.getEmail());
        requestBS.setPassword(clientDTO.getPassword());

    }

    public Client toBusinessDTO() {
        return requestBS;
    }
}
