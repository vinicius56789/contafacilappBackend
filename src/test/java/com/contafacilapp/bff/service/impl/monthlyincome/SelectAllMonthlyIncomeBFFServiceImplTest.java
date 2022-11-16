package com.contafacilapp.bff.service.impl.monthlyincome;

import com.contafacilapp.bff.dto.monthlyincome.MonthlyIncomeDTO;
import com.contafacilapp.bff.service.monthlyincome.impl.SelectAllMonthlyIncomeBFFServiceImpl;
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

import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class SelectAllMonthlyIncomeBFFServiceImplTest {

    @Mock
    private MonthlyIncomeService monthlyIncomeService;

    @InjectMocks
    private SelectAllMonthlyIncomeBFFServiceImpl service;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void selectAllMonthlyIncomeBFFServiceTest() {

        MonthlyIncomeDTO monthlyIncomeDTO = new MonthlyIncomeDTO();
        monthlyIncomeDTO.setClientId("1");

        List<MonthlyIncome> monthlyIncomes = new ArrayList<>();
        MonthlyIncome monthlyIncome = new MonthlyIncome();
        monthlyIncomes.add(monthlyIncome);

        Mockito.when(monthlyIncomeService.selectAllMonthlyIncome(Mockito.any())).thenReturn(monthlyIncomes);

        Assertions.assertNotNull(service.selectAllMonthlyIncomeBFFService(monthlyIncomeDTO));
    }
}
