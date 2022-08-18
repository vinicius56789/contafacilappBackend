package com.contafacilapp.bff.service.client.impl;

import com.contafacilapp.bff.dto.client.ClientDTO;
import com.contafacilapp.bff.dto.client.InsertClientBFFResponseDTO;
import com.contafacilapp.bff.mapper.client.InsertClientBFFRequestMapper;
import com.contafacilapp.bff.mapper.client.InsertClientBFFResponseMapper;
import com.contafacilapp.bff.service.client.InsertClientBFFService;
import com.contafacilapp.bs.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InsertClientBFFServiceImpl implements InsertClientBFFService {

    @Autowired
    private ClientService clientService;

    @Override
    public InsertClientBFFResponseDTO insertClientBFFService(ClientDTO clientDTO) {

        return new InsertClientBFFResponseMapper(
                clientService.insertClient(
                        new InsertClientBFFRequestMapper(clientDTO)
                                .toBusinessDTO())).toFrontEndDTO();
    }
}
