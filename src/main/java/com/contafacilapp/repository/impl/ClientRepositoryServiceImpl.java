package com.contafacilapp.repository.impl;

import com.contafacilapp.model.Client;
import com.contafacilapp.repository.ClientRepositoryService;
import com.contafacilapp.util.ConstantsIntegerUtils;
import com.contafacilapp.util.ConstantsStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.transaction.Transactional;

@Service
public class ClientRepositoryServiceImpl implements ClientRepositoryService {

    @Autowired
    private EntityManager entityManager;

    @Override
    public Client searchClient(Client client) {

        String query = "select c from client c where c.email = :email and c.password = :password";

        try {

            return entityManager.createQuery(query, Client.class)
                    .setParameter("email", client.getEmail())
                    .setParameter("password", client.getPassword())
                    .getSingleResult();

        } catch (NoResultException e) {
            Client error = new Client();
            error.setName(ConstantsStringUtils.WRONGCLIENT);
            return error;
        }

    }

    @Override
    @Modifying
    @Transactional
    public int insertClient(Client client) {

        try {

            entityManager.persist(client);

            return ConstantsIntegerUtils.ONE;

        } catch (Exception e) {
            return ConstantsIntegerUtils.ZERO;
        }
    }

    @Override
    @Modifying
    @Transactional
    public int updateClient(Client client) {

        String query = "update client c set c.name = :name, c.age = :age, c.occupation = :occupation where c.id = :id";

        return entityManager.createQuery(query)
                .setParameter("name", client.getName())
                .setParameter("age", client.getAge())
                .setParameter("occupation", client.getOccupation())
                .setParameter("id", client.getId())
                .executeUpdate();
    }
}
