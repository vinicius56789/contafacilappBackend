package com.contafacilapp.bff.service.impl.debt;

import com.contafacilapp.bff.dto.debt.DebtDTO;
import com.contafacilapp.bff.service.debt.impl.SelectAllDebtsBFFServiceImpl;
import com.contafacilapp.bs.DebtService;
import com.contafacilapp.model.Debt;
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
public class SelectAllDebtsBFFServiceImplTest {

    @Mock
    private DebtService debtService;

    @InjectMocks
    private SelectAllDebtsBFFServiceImpl service;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void selectAllDebtsBFFService() {

        DebtDTO debtDTO = new DebtDTO();
        debtDTO.setClientId("1");

        List<Debt> debts = new ArrayList<>();
        Debt debt = new Debt();
        debts.add(debt);

        Mockito.when(debtService.selectAllDebts(Mockito.any())).thenReturn(debts);

        Assertions.assertNotNull(service.selectAllDebtsBFFService(debtDTO));
    }
}
