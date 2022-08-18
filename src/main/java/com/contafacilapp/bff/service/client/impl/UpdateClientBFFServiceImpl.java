package com.contafacilapp.bff.service.client.impl;

import com.contafacilapp.bff.dto.client.ClientDTO;
import com.contafacilapp.bff.dto.client.UpdateClientBFFResponseDTO;
import com.contafacilapp.bff.mapper.client.UpdateClientBFFRequestMapper;
import com.contafacilapp.bff.mapper.client.UpdateClientBFFResponseMapper;
import com.contafacilapp.bff.service.client.UpdateClientBFFService;
import com.contafacilapp.bs.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateClientBFFServiceImpl implements UpdateClientBFFService {

    @Autowired
    private ClientService clientService;

    @Override
    public UpdateClientBFFResponseDTO updateClientBFFService(ClientDTO clientDTO) {

        return new UpdateClientBFFResponseMapper(
                clientService.updateClient(
                        new UpdateClientBFFRequestMapper(clientDTO)
                                .toBusinessDTO())).toFrontEndDTO();
    }
}
