package com.contafacilapp.bff.service.client;

import com.contafacilapp.bff.dto.client.ClientDTO;
import com.contafacilapp.bff.dto.client.SearchClientBFFResponseDTO;

public interface SearchClientBFFService {

    SearchClientBFFResponseDTO searchClientBFFService(ClientDTO clientDTO);

}
