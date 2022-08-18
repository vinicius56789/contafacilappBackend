package com.contafacilapp.bff.mapper.client;

import com.contafacilapp.bff.dto.client.ClientDTO;
import com.contafacilapp.model.Client;

public class UpdateClientBFFRequestMapper {

    private Client requestBS = new Client();

    public UpdateClientBFFRequestMapper(ClientDTO clientDTO) {

        requestBS.setName(clientDTO.getName());
        requestBS.setAge(clientDTO.getAge());
        requestBS.setOccupation(clientDTO.getOccupation());
        requestBS.setId(Long.valueOf(clientDTO.getClientId()));

    }

    public Client toBusinessDTO() {
        return requestBS;
    }
}
