package com.contafacilapp.bff.service.impl.monthlyincome;


import com.contafacilapp.bff.dto.monthlyincome.MonthlyIncomeDTO;
import com.contafacilapp.bff.service.monthlyincome.impl.SelectCurrentMonthlyIncomeBFFServiceImpl;
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
public class SelectCurrentMonthlyIncomeBFFServiceImplTest {

    @Mock
    private MonthlyIncomeService monthlyIncomeService;

    @InjectMocks
    private SelectCurrentMonthlyIncomeBFFServiceImpl service;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void selectCurrentMonthlyIncomeBFFServiceTest() {

        MonthlyIncomeDTO monthlyIncomeDTO = new MonthlyIncomeDTO();
        monthlyIncomeDTO.setClientId("1");

        MonthlyIncome monthlyIncome = new MonthlyIncome();

        Mockito.when(monthlyIncomeService.selectCurrentMonthlyIncome(Mockito.any())).thenReturn(monthlyIncome);

        Assertions.assertNotNull(service.selectCurrentMonthlyIncomeBFFService(monthlyIncomeDTO));
    }
}
