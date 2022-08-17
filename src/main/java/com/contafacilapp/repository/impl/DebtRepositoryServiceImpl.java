package com.contafacilapp.repository.impl;

import com.contafacilapp.model.Debt;
import com.contafacilapp.repository.DebtRepositoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Service
public class DebtRepositoryServiceImpl implements DebtRepositoryService {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Debt> selectAllDebts(Debt debt) {

        String query = "select d from debt d where d.client = :client";

        return entityManager.createQuery(query, Debt.class)
                .setParameter("client", debt.getClient())
                .getResultList();
    }

    @Override
    public Debt selectDebt(Debt debt) {

        String query = "select d from debt d where d.id = :id";

        return entityManager.createQuery(query, Debt.class)
                .setParameter("id", debt.getId())
                .getSingleResult();
    }

    @Override
    @Modifying
    @Transactional
    public int insertDebt(Debt debt) {

        try {

            entityManager.persist(debt);

            return 1;

        } catch (Exception e) {
            return 0;
        }

    }

    @Override
    @Modifying
    @Transactional
    public int updateDebt(Debt debt) {

        String query = "update debt d set d.monthlyInterest = :monthlyInterest, d.value = :value where d.id = :id";

        return entityManager.createQuery(query)
                .setParameter("monthlyInterest", debt.getMonthlyInterest())
                .setParameter("value", debt.getValue())
                .setParameter("id", debt.getId())
                .executeUpdate();
    }

    @Override
    @Modifying
    @Transactional
    public int deleteDebt(Debt debt) {

        String query = "delete from debt d where d.id = :id";

        return entityManager.createQuery(query)
                .setParameter("id", debt.getId())
                .executeUpdate();
    }
}
