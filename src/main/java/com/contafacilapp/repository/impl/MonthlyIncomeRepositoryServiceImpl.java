package com.contafacilapp.repository.impl;

import com.contafacilapp.model.MonthlyIncome;
import com.contafacilapp.repository.MonthlyIncomeRepositoryService;
import com.contafacilapp.util.ConstantsIntegerUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.List;

@Service
public class MonthlyIncomeRepositoryServiceImpl implements MonthlyIncomeRepositoryService {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<MonthlyIncome> selectAllMonthlyIncome(MonthlyIncome monthlyIncome) {

        String query = "select m from monthlyIncome where m.client = :client";

        return entityManager.createQuery(query, MonthlyIncome.class)
                .setParameter("client", monthlyIncome.getClient())
                .getResultList();
    }

    @Override
    public MonthlyIncome selectMonthlyIncome(MonthlyIncome monthlyIncome) {

        String query = "select m from monthlyIncome where m.id = :id";

        return entityManager.createQuery(query, MonthlyIncome.class)
                .setParameter("id", monthlyIncome.getId())
                .getSingleResult();
    }

    @Override
    public MonthlyIncome selectCurrentMonthlyIncome(MonthlyIncome monthlyIncome) {

        String query = "select m from monthlyIncome where m.client = :client";

        return entityManager.createQuery(query, MonthlyIncome.class)
                .setParameter("client", monthlyIncome.getClient())
                .setMaxResults(ConstantsIntegerUtils.ONE)
                .getSingleResult();
    }

    @Override
    public int insertMonthlyIncome(MonthlyIncome monthlyIncome) {

        try {

            entityManager.persist(monthlyIncome);

            return ConstantsIntegerUtils.ONE;

        } catch (Exception e) {
            return ConstantsIntegerUtils.ZERO;
        }
    }

    @Override
    public int updateMonthlyIncome(MonthlyIncome monthlyIncome) {

        String query = "update monthlyIncome m set m.salary = :salary, m.ticket = :ticket where m.id = :id";

        return entityManager.createQuery(query)
                .setParameter("salary", monthlyIncome.getSalary())
                .setParameter("ticket", monthlyIncome.getTicket())
                .setParameter("id", monthlyIncome.getId())
                .executeUpdate();
    }
}
