package com.contafacilapp.bff.mapper.client;

import com.contafacilapp.bff.dto.client.ClientDTO;
import com.contafacilapp.bff.dto.client.SearchClientBFFResponseDTO;
import com.contafacilapp.model.Client;

public class SearchClientBFFResponseMapper {

    private SearchClientBFFResponseDTO responseBFF = new SearchClientBFFResponseDTO();

    public SearchClientBFFResponseMapper(Client searchClient) {

        ClientDTO client = new ClientDTO();
        client.setClientId(String.valueOf(searchClient.getId()));
        client.setName(searchClient.getName());
        client.setAge(searchClient.getAge());
        client.setOccupation(searchClient.getOccupation());

        responseBFF.setContent(client);
    }

    public SearchClientBFFResponseDTO toFrontEndDTO() {
        return responseBFF;
    }
}
