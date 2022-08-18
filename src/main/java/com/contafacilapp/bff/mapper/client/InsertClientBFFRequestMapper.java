package com.contafacilapp.bff.mapper.client;

import com.contafacilapp.bff.dto.client.ClientDTO;
import com.contafacilapp.model.Client;

public class InsertClientBFFRequestMapper {

    private Client requestBS = new Client();

    public InsertClientBFFRequestMapper(ClientDTO clientDTO) {

        requestBS.setName(clientDTO.getName());
        requestBS.setAge(clientDTO.getAge());
        requestBS.setOccupation(clientDTO.getOccupation());
        requestBS.setOccupation(clientDTO.getOccupation());
    }

    public Client toBusinessDTO() {
        return requestBS;
    }
}
