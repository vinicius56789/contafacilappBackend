package com.contafacilapp.bs.impl;

import com.contafacilapp.model.MonthlyIncome;
import com.contafacilapp.repository.ExtraIncomeRepositoryService;
import com.contafacilapp.repository.MonthlyIncomeRepositoryService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class MonthlyIncomeServiceImplTest {

    @Mock
    private MonthlyIncomeRepositoryService gateway;

    @InjectMocks
    private MonthlyIncomeServiceImpl service;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void selectAllMonthlyIncomeTest() {

        MonthlyIncome monthlyIncome = new MonthlyIncome();

        List<MonthlyIncome> monthlyIncomes = new ArrayList<>();

        Mockito.when(gateway.selectAllMonthlyIncome(Mockito.any())).thenReturn(monthlyIncomes);

        Assertions.assertNotNull(service.selectAllMonthlyIncome(monthlyIncome));
    }

    @Test
    void selectMonthlyIncomeTest() {

        MonthlyIncome monthlyIncome = new MonthlyIncome();

        Mockito.when(gateway.selectMonthlyIncome(Mockito.any())).thenReturn(monthlyIncome);

        Assertions.assertNotNull(service.selectMonthlyIncome(monthlyIncome));
    }

    @Test
    void selectCurrentMonthlyIncomeTest() {

        MonthlyIncome monthlyIncome = new MonthlyIncome();

        Mockito.when(gateway.selectCurrentMonthlyIncome(Mockito.any())).thenReturn(monthlyIncome);

        Assertions.assertNotNull(service.selectCurrentMonthlyIncome(monthlyIncome));
    }

    @Test
    void insertMonthlyIncomeTest() {

        MonthlyIncome monthlyIncome = new MonthlyIncome();

        Mockito.when(gateway.insertMonthlyIncome(Mockito.any())).thenReturn(1);

        Assertions.assertNotNull(service.insertMonthlyIncome(monthlyIncome));
    }

    @Test
    void updateMonthlyIncomeTest() {

        MonthlyIncome monthlyIncome = new MonthlyIncome();

        Mockito.when(gateway.updateMonthlyIncome(Mockito.any())).thenReturn(1);

        Assertions.assertNotNull(service.updateMonthlyIncome(monthlyIncome));
    }
}
