package com.contafacilapp.repository.impl;

import com.contafacilapp.model.Client;
import com.contafacilapp.model.ExtraIncome;
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
public class ExtraIncomeRepositoryServiceImplTest {

    @Mock
    private EntityManager entityManager;

    @InjectMocks
    private ExtraIncomeRepositoryServiceImpl gateway;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void selectAllExtraIncomeTest() {

        ExtraIncome extraIncome = new ExtraIncome();

        Client client = new Client();
        client.setId(1L);

        List<ExtraIncome> extraIncomes = new ArrayList<>();

        Query query = Mockito.mock(Query.class);

        Mockito.when(entityManager.createQuery(Mockito.any(), Mockito.any())).thenReturn(query);
        Mockito.when(query.setParameter("client", extraIncome.getClient())).thenReturn(query);
        Mockito.when(query.getResultList()).thenReturn(extraIncomes);

        Assertions.assertNotNull(gateway.selectAllExtraIncome(extraIncome));
    }

    @Test
    void selectExtraIncomeTest() {

        ExtraIncome extraIncome = new ExtraIncome();
        extraIncome.setId(1L);

        Query query = Mockito.mock(Query.class);

        Mockito.when(entityManager.createQuery(Mockito.any(), Mockito.any())).thenReturn(query);
        Mockito.when(query.setParameter("id", extraIncome.getId())).thenReturn(query);
        Mockito.when(query.getSingleResult()).thenReturn(extraIncome);

        Assertions.assertNotNull(gateway.selectExtraIncome(extraIncome));
    }

    @Test
    void selectAllExtraIncomeOfThisMonthTest() {

        ExtraIncome extraIncome = new ExtraIncome();
        extraIncome.setId(1L);

        List<ExtraIncome> extraIncomes = new ArrayList<>();

        Query query = Mockito.mock(Query.class);

        Mockito.when(entityManager.createQuery(Mockito.any(), Mockito.any())).thenReturn(query);
        Mockito.when(query.setParameter("month", extraIncome.getMonth())).thenReturn(query);
        Mockito.when(query.setParameter("year", extraIncome.getYear())).thenReturn(query);
        Mockito.when(query.setParameter("client", extraIncome.getClient())).thenReturn(query);
        Mockito.when(query.getResultList()).thenReturn(extraIncomes);

        Assertions.assertNotNull(gateway.selectAllExtraIncomeOfThisMonth(extraIncome));
    }

    @Test
    void insertExtraIncomeTest() {

        ExtraIncome extraIncome = new ExtraIncome();

        Assertions.assertNotNull(gateway.insertExtraIncome(extraIncome));
    }

    @Test
    void updateExtraIncomeTest() {

        ExtraIncome extraIncome = new ExtraIncome();
        extraIncome.setId(1L);
        extraIncome.setDescription("desc");
        extraIncome.setName("name");
        extraIncome.setValue("123");

        Query query = Mockito.mock(Query.class);

        Mockito.when(entityManager.createQuery("update extraIncome e set e.name = :name, e.description = :description, e.value where e.id = :id")).thenReturn(query);
        Mockito.when(query.setParameter("name", extraIncome.getName())).thenReturn(query);
        Mockito.when(query.setParameter("description", extraIncome.getDescription())).thenReturn(query);
        Mockito.when(query.setParameter("value", extraIncome.getValue())).thenReturn(query);
        Mockito.when(query.setParameter("id", extraIncome.getId())).thenReturn(query);
        Mockito.when(query.executeUpdate()).thenReturn(1);

        Assertions.assertNotNull(gateway.updateExtraIncome(extraIncome));
    }

    @Test
    void deleteExtraIncomeTest() {

        ExtraIncome extraIncome = new ExtraIncome();
        extraIncome.setId(1L);

        Query query = Mockito.mock(Query.class);

        Mockito.when(entityManager.createQuery("delete from extraIncome where id = :id")).thenReturn(query);
        Mockito.when(query.setParameter("id", extraIncome.getId())).thenReturn(query);
        Mockito.when(query.executeUpdate()).thenReturn(1);

        Assertions.assertNotNull(gateway.deleteExtraIncome(extraIncome));
    }
}
