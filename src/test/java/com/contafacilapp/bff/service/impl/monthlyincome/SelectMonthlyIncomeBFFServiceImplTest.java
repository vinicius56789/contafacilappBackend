package com.contafacilapp.bff.service.impl.monthlyincome;

import com.contafacilapp.bff.dto.monthlyincome.MonthlyIncomeDTO;
import com.contafacilapp.bff.service.monthlyincome.impl.SelectMonthlyIncomeBFFServiceImpl;
import com.contafacilapp.bs.MonthlyIncomeService;
import com.contafacilapp.model.MonthlyIncome;
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
public class SelectMonthlyIncomeBFFServiceImplTest {

    @Mock
    private MonthlyIncomeService monthlyIncomeService;

    @InjectMocks
    private SelectMonthlyIncomeBFFServiceImpl service;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void selectMonthlyIncomeBFFServiceTest() {

        MonthlyIncomeDTO monthlyIncomeDTO = new MonthlyIncomeDTO();
        monthlyIncomeDTO.setMonthlyIncomeId("1");

        MonthlyIncome monthlyIncome = new MonthlyIncome();

        Mockito.when(monthlyIncomeService.selectMonthlyIncome(Mockito.any())).thenReturn(monthlyIncome);

        Assertions.assertNotNull(service.selectMonthlyIncomeBFFService(monthlyIncomeDTO));
    }
}
