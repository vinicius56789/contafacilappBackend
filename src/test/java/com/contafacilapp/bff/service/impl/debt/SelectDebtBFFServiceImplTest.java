package com.contafacilapp.bff.service.impl.debt;

import com.contafacilapp.bff.dto.debt.DebtDTO;
import com.contafacilapp.bff.service.debt.impl.SelectDebtBFFServiceImpl;
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

@ExtendWith(MockitoExtension.class)
public class SelectDebtBFFServiceImplTest {

    @Mock
    private DebtService debtService;

    @InjectMocks
    private SelectDebtBFFServiceImpl service;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void selectDebtBFFServiceTest() {

        DebtDTO debtDTO = new DebtDTO();
        debtDTO.setDebtId("1");

        Debt debt = new Debt();

        Mockito.when(debtService.selectDebt(Mockito.any())).thenReturn(debt);

        Assertions.assertNotNull(service.selectDebtBFFService(debtDTO));
    }
}
