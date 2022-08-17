package com.contafacilapp.repository;

import com.contafacilapp.model.Client;

public interface ClientRepositoryService {

    Client searchClient(Client client);

    int insertClient(Client client);

    int updateClient(Client client);

}
