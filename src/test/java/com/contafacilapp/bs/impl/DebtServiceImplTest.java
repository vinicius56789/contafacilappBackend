package com.contafacilapp.bs.impl;

import com.contafacilapp.model.Debt;
import com.contafacilapp.repository.DebtRepositoryService;
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
public class DebtServiceImplTest {

    @Mock
    private DebtRepositoryService gateway;

    @InjectMocks
    private DebtServiceImpl service;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void selectAllDebtsTest() {

        Debt debt = new Debt();

        List<Debt> debts = new ArrayList<>();

        Mockito.when(gateway.selectAllDebts(Mockito.any())).thenReturn(debts);

        Assertions.assertNotNull(service.selectAllDebts(debt));
    }

    @Test
    void selectDebtTest() {

        Debt debt = new Debt();

        Mockito.when(gateway.selectDebt(Mockito.any())).thenReturn(debt);

        Assertions.assertNotNull(service.selectDebt(debt));
    }

    @Test
    void insertDebtTest() {

        Debt debt = new Debt();

        Mockito.when(gateway.insertDebt(Mockito.any())).thenReturn(1);

        Assertions.assertNotNull(service.insertDebt(debt));
    }

    @Test
    void updateDebtTest() {

        Debt debt = new Debt();

        Mockito.when(gateway.updateDebt(Mockito.any())).thenReturn(1);

        Assertions.assertNotNull(service.updateDebt(debt));
    }

    @Test
    void deleteDebtTest() {

        Debt debt = new Debt();

        Mockito.when(gateway.deleteDebt(Mockito.any())).thenReturn(1);

        Assertions.assertNotNull(service.deleteDebt(debt));
    }
}
