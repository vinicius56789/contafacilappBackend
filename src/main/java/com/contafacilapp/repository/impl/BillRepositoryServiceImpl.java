package com.contafacilapp.repository.impl;

import com.contafacilapp.model.Bill;
import com.contafacilapp.repository.BillRepositoryService;
import com.contafacilapp.util.ConstantsIntegerUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Service
public class BillRepositoryServiceImpl implements BillRepositoryService {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Bill> selectAllBills(Bill bill) {

        String query = "select b from bill b where b.client = :client";

        return entityManager.createQuery(query, Bill.class)
                .setParameter("client", bill.getClient())
                .getResultList();
    }

    @Override
    public Bill selectBill(Bill bill) {

        String query = "select b from bill b where b.id = :id";

        return entityManager.createQuery(query, Bill.class)
                .setParameter("id", bill.getId())
                .getSingleResult();
    }

    @Override
    @Modifying
    @Transactional
    public int updateBill(Bill bill) {

        String query = "update bill b set b.value = :value, b.dueDate = :dueDate, b.reminder = :reminder, b.description = :description" +
                "b.title = :title, b.month = :month, b.year = :year, b.constant = :constant, b.paid = :paid, b.paidMonth = :paidMonth, b.category = :category" +
                " where b.id = :id";

        return entityManager.createQuery(query)
                .setParameter("value", bill.getValue())
                .setParameter("dueDate", bill.getDueDate())
                .setParameter("reminder", bill.getReminder())
                .setParameter("description", bill.getDescription())
                .setParameter("title", bill.getTitle())
                .setParameter("month", bill.getMonth())
                .setParameter("year", bill.getYear())
                .setParameter("constant", bill.getConstant())
                .setParameter("paid", bill.getPaid())
                .setParameter("paidMonth", bill.getPaidMonth())
                .setParameter("category", bill.getCategory())
                .setParameter("id", bill.getId())
                .executeUpdate();

    }

    @Override
    @Modifying
    @Transactional
    public int deleteBill(Bill bill) {

        String query = "delete from bill b where b.id = :id";

        return entityManager.createQuery(query)
                .setParameter("id", bill.getId())
                .executeUpdate();
    }

    @Override
    @Modifying
    @Transactional
    public int insertBill(Bill bill) {

        try {

            entityManager.persist(bill);

            return ConstantsIntegerUtils.ONE;

        } catch (Exception e) {
            return ConstantsIntegerUtils.ZERO;
        }
    }
}
