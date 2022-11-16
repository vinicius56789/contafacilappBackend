package com.contafacilapp.bs.impl;

import com.contafacilapp.model.ExtraIncome;
import com.contafacilapp.repository.EventRepositoryService;
import com.contafacilapp.repository.ExtraIncomeRepositoryService;
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
public class ExtraIncomeServiceImplTest {

    @Mock
    private ExtraIncomeRepositoryService gateway;

    @InjectMocks
    private ExtraIncomeServiceImpl service;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void selectAllExtraIncomeTest() {

        ExtraIncome extraIncome = new ExtraIncome();

        List<ExtraIncome> extraIncomes = new ArrayList<>();

        Mockito.when(gateway.selectAllExtraIncome(Mockito.any())).thenReturn(extraIncomes);

        Assertions.assertNotNull(service.selectAllExtraIncome(extraIncome));
    }

    @Test
    void selectExtraIncomeTest() {

        ExtraIncome extraIncome = new ExtraIncome();

        Mockito.when(gateway.selectExtraIncome(Mockito.any())).thenReturn(extraIncome);

        Assertions.assertNotNull(service.selectExtraIncome(extraIncome));
    }

    @Test
    void selectAllExtraIncomeOfThisMonthTest() {

        ExtraIncome extraIncome = new ExtraIncome();

        List<ExtraIncome> extraIncomes = new ArrayList<>();

        Mockito.when(gateway.selectAllExtraIncomeOfThisMonth(Mockito.any())).thenReturn(extraIncomes);

        Assertions.assertNotNull(service.selectAllExtraIncomeOfThisMonth(extraIncome));
    }

    @Test
    void insertExtraIncomeTest() {

        ExtraIncome extraIncome = new ExtraIncome();

        Mockito.when(gateway.insertExtraIncome(Mockito.any())).thenReturn(1);

        Assertions.assertNotNull(service.insertExtraIncome(extraIncome));
    }

    @Test
    void updateExtraIncomeTest() {

        ExtraIncome extraIncome = new ExtraIncome();

        Mockito.when(gateway.updateExtraIncome(Mockito.any())).thenReturn(1);

        Assertions.assertNotNull(service.updateExtraIncome(extraIncome));
    }

    @Test
    void deleteExtraIncomeTest() {

        ExtraIncome extraIncome = new ExtraIncome();

        Mockito.when(gateway.deleteExtraIncome(Mockito.any())).thenReturn(1);

        Assertions.assertNotNull(service.deleteExtraIncome(extraIncome));
    }
}
