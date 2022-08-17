package com.contafacilapp.bs.impl;

import com.contafacilapp.bs.ClientService;
import com.contafacilapp.model.Client;
import com.contafacilapp.repository.ClientRepositoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepositoryService gateway;

    @Override
    public Client searchClient(Client client) {
        return gateway.searchClient(client);
    }

    @Override
    public int insertClient(Client client) {
        return gateway.insertClient(client);
    }

    @Override
    public int updateClient(Client client) {
        return gateway.updateClient(client);
    }
}
