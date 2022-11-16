package com.contafacilapp.bff.service.impl.debt;

import com.contafacilapp.bff.dto.debt.DebtDTO;
import com.contafacilapp.bff.service.debt.impl.InsertDebtBFFServiceImpl;
import com.contafacilapp.bs.DebtService;
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
public class InsertDebtBFFServiceImplTest {

    @Mock
    private DebtService debtService;

    @InjectMocks
    private InsertDebtBFFServiceImpl service;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void insertDebtBFFServiceSuccessTest() {

        DebtDTO debtDTO = new DebtDTO();
        debtDTO.setClientId("1");

        Mockito.when(debtService.insertDebt(Mockito.any())).thenReturn(1);

        Assertions.assertNotNull(service.insertDebtBFFService(debtDTO));
    }

    @Test
    void insertDebtBFFServiceErrorTest() {

        DebtDTO debtDTO = new DebtDTO();
        debtDTO.setClientId("1");

        Mockito.when(debtService.insertDebt(Mockito.any())).thenReturn(0);

        Assertions.assertNotNull(service.insertDebtBFFService(debtDTO));
    }
}
