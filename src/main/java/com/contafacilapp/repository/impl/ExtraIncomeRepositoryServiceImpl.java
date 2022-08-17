package com.contafacilapp.repository.impl;

import com.contafacilapp.model.ExtraIncome;
import com.contafacilapp.repository.ExtraIncomeRepositoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Service
public class ExtraIncomeRepositoryServiceImpl implements ExtraIncomeRepositoryService {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<ExtraIncome> selectAllExtraIncome(ExtraIncome extraIncome) {

        String query = "select e from extraIncome e where e.client = :client";

        return entityManager.createQuery(query, ExtraIncome.class)
                .setParameter("client", extraIncome.getClient())
                .getResultList();
    }

    @Override
    public ExtraIncome selectExtraIncome(ExtraIncome extraIncome) {

        String query = "select e from extraIncome e where e.id = :id";

        return entityManager.createQuery(query, ExtraIncome.class)
                .setParameter("id", extraIncome.getId())
                .getSingleResult();
    }

    @Override
    public List<ExtraIncome> selectAllExtraIncomeOfThisMonth(ExtraIncome extraIncome) {

        String query = "select e from extraIncome e where e.month = :month and e.year = :year";

        return entityManager.createQuery(query, ExtraIncome.class)
                .setParameter("month", extraIncome.getMonth())
                .setParameter("year", extraIncome.getYear())
                .getResultList();
    }

    @Override
    @Modifying
    @Transactional
    public int insertExtraIncome(ExtraIncome extraIncome) {

        try {

            entityManager.persist(extraIncome);

            return 1;

        } catch (Exception e) {
            return 0;
        }
    }

    @Override
    @Modifying
    @Transactional
    public int updateExtraIncome(ExtraIncome extraIncome) {

        String query = "update extraIncome e set e.name = :name, e.description = :description, e.value where e.id = :id";

        return entityManager.createQuery(query)
                .setParameter("name", extraIncome.getName())
                .setParameter("description", extraIncome.getDescription())
                .setParameter("value", extraIncome.getValue())
                .setParameter("id", extraIncome.getId())
                .executeUpdate();
    }

    @Override
    @Modifying
    @Transactional
    public int deleteExtraIncome(ExtraIncome extraIncome) {

        String query = "delete from extraIncome where id = :id";

        return entityManager.createQuery(query)
                .setParameter("id", extraIncome.getId())
                .executeUpdate();
    }
}
