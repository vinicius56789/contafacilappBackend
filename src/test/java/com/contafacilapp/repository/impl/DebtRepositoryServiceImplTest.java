package com.contafacilapp.repository.impl;

import com.contafacilapp.model.Client;
import com.contafacilapp.model.Debt;
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
public class DebtRepositoryServiceImplTest {

    @Mock
    private EntityManager entityManager;

    @InjectMocks
    private DebtRepositoryServiceImpl gateway;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void selectAllDebtsTest() {

        Debt debt = new Debt();

        Client client = new Client();
        client.setId(1L);

        debt.setClient(client);

        List<Debt> debts = new ArrayList<>();

        Query query = Mockito.mock(Query.class);

        Mockito.when(entityManager.createQuery(Mockito.any(), Mockito.any())).thenReturn(query);
        Mockito.when(query.setParameter("client", debt.getClient())).thenReturn(query);
        Mockito.when(query.getResultList()).thenReturn(debts);

        Assertions.assertNotNull(gateway.selectAllDebts(debt));
    }

    @Test
    void selectDebtTest() {

        Debt debt = new Debt();
        debt.setId(1L);

        Query query = Mockito.mock(Query.class);

        Mockito.when(entityManager.createQuery(Mockito.any(), Mockito.any())).thenReturn(query);
        Mockito.when(query.setParameter("id", debt.getId())).thenReturn(query);
        Mockito.when(query.getSingleResult()).thenReturn(debt);

        Assertions.assertNotNull(gateway.selectDebt(debt));
    }

    @Test
    void insertDebTest() {

        Debt debt = new Debt();

        Assertions.assertNotNull(gateway.insertDebt(debt));
    }

    @Test
    void updateDebtTest() {

        Debt debt = new Debt();
        debt.setId(1L);

        Query query = Mockito.mock(Query.class);

        Mockito.when(entityManager.createQuery("update debt d set d.monthlyInterest = :monthlyInterest, d.value = :value where d.id = :id")).thenReturn(query);
        Mockito.when(query.setParameter("monthlyInterest", debt.getMonthlyInterest())).thenReturn(query);
        Mockito.when(query.setParameter("value", debt.getValue())).thenReturn(query);
        Mockito.when(query.setParameter("id", debt.getId())).thenReturn(query);
        Mockito.when(query.executeUpdate()).thenReturn(1);

        Assertions.assertNotNull(gateway.updateDebt(debt));
    }

    @Test
    void deleteDebtTest() {

        Debt debt = new Debt();
        debt.setId(1L);

        Query query = Mockito.mock(Query.class);

        Mockito.when(entityManager.createQuery("delete from debt d where d.id = :id")).thenReturn(query);
        Mockito.when(query.setParameter("id", debt.getId())).thenReturn(query);
        Mockito.when(query.executeUpdate()).thenReturn(1);

        Assertions.assertNotNull(gateway.deleteDebt(debt));
    }
}
