package com.contafacilapp.bs;

import com.contafacilapp.model.Client;

public interface ClientService {

    Client searchClient(Client client);

    int insertClient(Client client);

    int updateClient(Client client);
}
