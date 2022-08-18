package com.contafacilapp.bff.service.client.impl;

import com.contafacilapp.bff.dto.client.ClientDTO;
import com.contafacilapp.bff.dto.client.SearchClientBFFResponseDTO;
import com.contafacilapp.bff.mapper.client.SearchClientBFFRequestMapper;
import com.contafacilapp.bff.mapper.client.SearchClientBFFResponseMapper;
import com.contafacilapp.bff.service.client.SearchClientBFFService;
import com.contafacilapp.bs.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SearchClientBFFServiceImpl implements SearchClientBFFService {

    @Autowired
    private ClientService clientService;

    @Override
    public SearchClientBFFResponseDTO searchClientBFFService(ClientDTO clientDTO) {

        return new SearchClientBFFResponseMapper(
                clientService.searchClient(
                        new SearchClientBFFRequestMapper(clientDTO)
                                .toBusinessDTO())).toFrontEndDTO();
    }
}
