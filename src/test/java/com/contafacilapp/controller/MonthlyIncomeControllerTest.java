package com.contafacilapp.controller;

import com.contafacilapp.bff.dto.monthlyincome.*;
import com.contafacilapp.bff.service.monthlyincome.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

@ExtendWith(MockitoExtension.class)
public class MonthlyIncomeControllerTest {

    @Mock
    private InsertMonthlyIncomeBFFService insertMonthlyIncomeBFFService;

    @Mock
    private SelectAllMonthlyIncomeBFFService selectAllMonthlyIncomeBFFService;

    @Mock
    private SelectCurrentMonthlyIncomeBFFService selectCurrentMonthlyIncomeBFFService;

    @Mock
    private SelectMonthlyIncomeBFFService selectMonthlyIncomeBFFService;

    @Mock
    private UpdateMonthlyIncomeBFFService updateMonthlyIncomeBFFService;

    @InjectMocks
    private MonthlyIncomeController controller;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void insertMonthlyIncomeTest() {

        MonthlyIncomeDTO monthlyIncomeDTO = new MonthlyIncomeDTO();

        InsertMonthlyIncomeBFFResponseDTO insertMonthlyIncomeBFFResponseDTO = new InsertMonthlyIncomeBFFResponseDTO();

        Mockito.when(insertMonthlyIncomeBFFService.insertMonthlyIncomeBFFService(Mockito.any())).thenReturn(insertMonthlyIncomeBFFResponseDTO);

        Assertions.assertNotNull(controller.insertMonthlyIncome(monthlyIncomeDTO));
    }

    @Test
    void selectAllMonthlyIncomeTest() {

        MonthlyIncomeDTO monthlyIncomeDTO = new MonthlyIncomeDTO();

        SelectAllMonthlyIncomeBFFResponseDTO insertMonthlyIncomeBFFResponseDTO = new SelectAllMonthlyIncomeBFFResponseDTO();

        Mockito.when(selectAllMonthlyIncomeBFFService.selectAllMonthlyIncomeBFFService(Mockito.any())).thenReturn(insertMonthlyIncomeBFFResponseDTO);

        Assertions.assertNotNull(controller.selectAllMonthlyIncome(monthlyIncomeDTO));
    }

    @Test
    void selectCurrentMonthlyIncomeTest() {

        MonthlyIncomeDTO monthlyIncomeDTO = new MonthlyIncomeDTO();

        SelectCurrentMonthlyIncomeBFFResponseDTO insertMonthlyIncomeBFFResponseDTO = new SelectCurrentMonthlyIncomeBFFResponseDTO();

        Mockito.when(selectCurrentMonthlyIncomeBFFService.selectCurrentMonthlyIncomeBFFService(Mockito.any())).thenReturn(insertMonthlyIncomeBFFResponseDTO);

        Assertions.assertNotNull(controller.selectCurrentMonthlyIncome(monthlyIncomeDTO));
    }

    @Test
    void selectMonthlyIncomeTest() {

        MonthlyIncomeDTO monthlyIncomeDTO = new MonthlyIncomeDTO();

        SelectMonthlyIncomeBFFResponseDTO insertMonthlyIncomeBFFResponseDTO = new SelectMonthlyIncomeBFFResponseDTO();

        Mockito.when(selectMonthlyIncomeBFFService.selectMonthlyIncomeBFFService(Mockito.any())).thenReturn(insertMonthlyIncomeBFFResponseDTO);

        Assertions.assertNotNull(controller.selectMonthlyIncome(monthlyIncomeDTO));
    }

    @Test
    void updateMonthlyIncomeTest() {

        MonthlyIncomeDTO monthlyIncomeDTO = new MonthlyIncomeDTO();

        UpdateMonthlyIncomeBFFResponseDTO insertMonthlyIncomeBFFResponseDTO = new UpdateMonthlyIncomeBFFResponseDTO();

        Mockito.when(updateMonthlyIncomeBFFService.updateMonthlyIncomeBFFService(Mockito.any())).thenReturn(insertMonthlyIncomeBFFResponseDTO);

        Assertions.assertNotNull(controller.updateMonthlyIncome(monthlyIncomeDTO));
    }

}
