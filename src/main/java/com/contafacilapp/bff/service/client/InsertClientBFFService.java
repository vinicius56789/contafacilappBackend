package com.contafacilapp.bff.service.client;

import com.contafacilapp.bff.dto.client.ClientDTO;
import com.contafacilapp.bff.dto.client.InsertClientBFFResponseDTO;

public interface InsertClientBFFService {

    InsertClientBFFResponseDTO insertClientBFFService(ClientDTO clientDTO);
}
