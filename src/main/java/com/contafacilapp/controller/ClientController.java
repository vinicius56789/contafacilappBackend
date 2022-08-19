package com.contafacilapp.controller;

import com.contafacilapp.bff.dto.client.ClientDTO;
import com.contafacilapp.bff.dto.client.InsertClientBFFResponseDTO;
import com.contafacilapp.bff.dto.client.SearchClientBFFResponseDTO;
import com.contafacilapp.bff.dto.client.UpdateClientBFFResponseDTO;
import com.contafacilapp.bff.service.client.InsertClientBFFService;
import com.contafacilapp.bff.service.client.SearchClientBFFService;
import com.contafacilapp.bff.service.client.UpdateClientBFFService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private InsertClientBFFService insertClientBFFService;

    @Autowired
    private SearchClientBFFService searchClientBFFService;

    @Autowired
    private UpdateClientBFFService updateClientBFFService;

    @PostMapping("/insert")
    public InsertClientBFFResponseDTO insertClient(@RequestBody ClientDTO clientDTO) {
        return insertClientBFFService.insertClientBFFService(clientDTO);
    }

    @PostMapping("/login")
    public SearchClientBFFResponseDTO searchClient(@RequestBody ClientDTO clientDTO) {
        return searchClientBFFService.searchClientBFFService(clientDTO);
    }

    @PostMapping("/update")
    public UpdateClientBFFResponseDTO updateClient(@RequestBody ClientDTO clientDTO) {
        return updateClientBFFService.updateClientBFFService(clientDTO);
    }
}
