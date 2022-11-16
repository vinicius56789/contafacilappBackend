package com.contafacilapp.bff.service.impl.monthlyincome;


import com.contafacilapp.bff.dto.monthlyincome.MonthlyIncomeDTO;
import com.contafacilapp.bff.service.monthlyincome.impl.InsertMonthlyIncomeBFFServiceImpl;
import com.contafacilapp.bs.MonthlyIncomeService;
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
public class InsertMonthlyIncomeBFFServiceImplTest {

    @Mock
    private MonthlyIncomeService monthlyIncomeService;

    @InjectMocks
    private InsertMonthlyIncomeBFFServiceImpl service;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void insertMonthlyIncomeBFFServiceSuccessTest() {

        MonthlyIncomeDTO monthlyIncomeDTO = new MonthlyIncomeDTO();
        monthlyIncomeDTO.setClientId("1");

        Mockito.when(monthlyIncomeService.insertMonthlyIncome(Mockito.any())).thenReturn(1);

        Assertions.assertNotNull(service.insertMonthlyIncomeBFFService(monthlyIncomeDTO));
    }

    @Test
    void insertMonthlyIncomeBFFServiceErrorTest() {

        MonthlyIncomeDTO monthlyIncomeDTO = new MonthlyIncomeDTO();
        monthlyIncomeDTO.setClientId("1");

        Mockito.when(monthlyIncomeService.insertMonthlyIncome(Mockito.any())).thenReturn(0);

        Assertions.assertNotNull(service.insertMonthlyIncomeBFFService(monthlyIncomeDTO));
    }
}
