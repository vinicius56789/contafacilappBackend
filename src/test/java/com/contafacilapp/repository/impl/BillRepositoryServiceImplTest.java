package com.contafacilapp.repository.impl;

import com.contafacilapp.model.Bill;
import com.contafacilapp.model.Category;
import com.contafacilapp.model.Client;
import org.hibernate.query.Query;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class BillRepositoryServiceImplTest {

    @Mock private EntityManager entityManager;

    @InjectMocks private BillRepositoryServiceImpl gateway;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void selectAllBillsTest() {

        Bill bill = new Bill();
        bill.setId(1L);

        Client client = new Client();
        client.setId(1L);

        bill.setClient(client);

        List<Object> bills = new ArrayList<>();
        bills.add(bill);

        Query query = Mockito.mock(Query.class);

        Mockito.when(entityManager.createQuery(Mockito.any(), Mockito.any())).thenReturn(query);
        Mockito.when(query.setParameter("client", bill.getClient())).thenReturn(query);
        Mockito.when(query.getResultList()).thenReturn(bills);

        Assertions.assertNotNull(gateway.selectAllBills(bill));
    }

    @Test
    void selectBillTest() {

        Bill bill = new Bill();
        bill.setId(1L);

        Query query = Mockito.mock(Query.class);

        Mockito.when(entityManager.createQuery(Mockito.any(), Mockito.any())).thenReturn(query);
        Mockito.when(query.setParameter("id", bill.getId())).thenReturn(query);
        Mockito.when(query.getSingleResult()).thenReturn(bill);

        Assertions.assertNotNull(gateway.selectBill(bill));
    }

    @Test
    void updateBillTest() {

        Category category = new Category();
        category.setId(1L);

        Bill bill = new Bill();
        bill.setId(1L);
        bill.setValue("123");
        bill.setDueDate("20/20/2023");
        bill.setReminder("S");
        bill.setDescription("anbc");
        bill.setTitle("abcd");
        bill.setMonth("11");
        bill.setYear("2022");
        bill.setConstant(false);
        bill.setPaid("S");
        bill.setPaidMonth("11");
        bill.setCategory(category);

        Query query = Mockito.mock(Query.class);
        Mockito.when(entityManager.createQuery("update bill b set b.value = :value, b.dueDate = :dueDate, b.reminder = :reminder, b.description = :description" +
                "b.title = :title, b.month = :month, b.year = :year, b.constant = :constant, b.paid = :paid, b.paidMonth = :paidMonth, b.category = :category" +
                " where b.id = :id")).thenReturn(query);
        Mockito.when(query.setParameter("value", bill.getValue())).thenReturn(query);
        Mockito.when(query.setParameter("dueDate", bill.getDueDate())).thenReturn(query);
        Mockito.when(query.setParameter("reminder", bill.getReminder())).thenReturn(query);
        Mockito.when(query.setParameter("description", bill.getDescription())).thenReturn(query);
        Mockito.when(query.setParameter("title", bill.getTitle())).thenReturn(query);
        Mockito.when(query.setParameter("month", bill.getMonth())).thenReturn(query);
        Mockito.when(query.setParameter("year", bill.getYear())).thenReturn(query);
        Mockito.when(query.setParameter("constant", bill.getConstant())).thenReturn(query);
        Mockito.when(query.setParameter("paid", bill.getPaid())).thenReturn(query);
        Mockito.when(query.setParameter("paidMonth", bill.getPaidMonth())).thenReturn(query);
        Mockito.when(query.setParameter("category", bill.getCategory())).thenReturn(query);
        Mockito.when(query.setParameter("id", bill.getId())).thenReturn(query);
        Mockito.when(query.executeUpdate()).thenReturn(1);

        Assertions.assertNotNull(gateway.updateBill(bill));
    }

    @Test
    void deleteBillTest() {

        Bill bill = new Bill();
        bill.setId(1L);

        Query query = Mockito.mock(Query.class);

        Mockito.when(entityManager.createQuery("delete from bill b where b.id = :id")).thenReturn(query);
        Mockito.when(query.setParameter("id", bill.getId())).thenReturn(query);
        Mockito.when(query.executeUpdate()).thenReturn(1);

        Assertions.assertNotNull(gateway.deleteBill(bill));
    }

    @Test
    void insertBillTest() {

        Category category = new Category();
        category.setId(1L);

        Bill bill = new Bill();
        bill.setId(1L);
        bill.setValue("123");
        bill.setDueDate("20/20/2023");
        bill.setReminder("S");
        bill.setDescription("anbc");
        bill.setTitle("abcd");
        bill.setMonth("11");
        bill.setYear("2022");
        bill.setConstant(false);
        bill.setPaid("S");
        bill.setPaidMonth("11");
        bill.setCategory(category);

        Assertions.assertNotNull(gateway.insertBill(bill));
    }
}
