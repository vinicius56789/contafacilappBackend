package com.contafacilapp.bff.service.client;

import com.contafacilapp.bff.dto.client.ClientDTO;
import com.contafacilapp.bff.dto.client.UpdateClientBFFResponseDTO;

public interface UpdateClientBFFService {

    UpdateClientBFFResponseDTO updateClientBFFService(ClientDTO clientDTO);

}
