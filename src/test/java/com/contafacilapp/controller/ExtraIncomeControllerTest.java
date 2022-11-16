package com.contafacilapp.controller;

import com.contafacilapp.bff.dto.extraincome.*;
import com.contafacilapp.bff.service.extraincome.*;
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
public class ExtraIncomeControllerTest {

    @Mock
    private DeleteExtraIncomeBFFService deleteExtraIncomeBFFService;

    @Mock
    private InsertExtraIncomeBFFService insertExtraIncomeBFFService;

    @Mock
    private SelectAllExtraIncomeBFFService selectAllExtraIncomeBFFService;

    @Mock
    private SelectAllExtraIncomeOfThisMonthBFFService selectAllExtraIncomeOfThisMonthBFFService;

    @Mock
    private SelectExtraIncomeBFFService selectExtraIncomeBFFService;

    @Mock
    private UpdateExtraIncomeBFFService updateExtraIncomeBFFService;

    @InjectMocks
    private ExtraIncomeController controller;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void deleteExtraIncomeTest() {

        ExtraIncomeDTO extraIncomeDTO = new ExtraIncomeDTO();

        DeleteExtraIncomeBFFResponseDTO deleteExtraIncomeBFFResponseDTO = new DeleteExtraIncomeBFFResponseDTO();

        Mockito.when(deleteExtraIncomeBFFService.deleteExtraIncomeBFFService(Mockito.any())).thenReturn(deleteExtraIncomeBFFResponseDTO);

        Assertions.assertNotNull(controller.deleteExtraIncome(extraIncomeDTO));
    }

    @Test
    void insertExtraIncomeTest() {

        ExtraIncomeDTO extraIncomeDTO = new ExtraIncomeDTO();

        InsertExtraIncomeBFFResponseDTO deleteExtraIncomeBFFResponseDTO = new InsertExtraIncomeBFFResponseDTO();

        Mockito.when(insertExtraIncomeBFFService.insertExtraIncomeBFFService(Mockito.any())).thenReturn(deleteExtraIncomeBFFResponseDTO);

        Assertions.assertNotNull(controller.insertExtraIncome(extraIncomeDTO));
    }

    @Test
    void selectAllExtraIncomeTest() {

        ExtraIncomeDTO extraIncomeDTO = new ExtraIncomeDTO();

        SelectAllExtraIncomeBFFResponseDTO deleteExtraIncomeBFFResponseDTO = new SelectAllExtraIncomeBFFResponseDTO();

        Mockito.when(selectAllExtraIncomeBFFService.selectAllExtraIncomeBFFService(Mockito.any())).thenReturn(deleteExtraIncomeBFFResponseDTO);

        Assertions.assertNotNull(controller.selectAllExtraIncome(extraIncomeDTO));
    }

    @Test
    void selectAllExtraIncomeOfThisMonthTest() {

        ExtraIncomeDTO extraIncomeDTO = new ExtraIncomeDTO();

        SelectAllExtraIncomeOfThisMonthBFFResponseDTO deleteExtraIncomeBFFResponseDTO = new SelectAllExtraIncomeOfThisMonthBFFResponseDTO();

        Mockito.when(selectAllExtraIncomeOfThisMonthBFFService.selectAllExtraIncomeOfThisMonthBFFService(Mockito.any())).thenReturn(deleteExtraIncomeBFFResponseDTO);

        Assertions.assertNotNull(controller.selectAllExtraIncomeOfThisMonth(extraIncomeDTO));
    }

    @Test
    void selectExtraIncomeTest() {

        ExtraIncomeDTO extraIncomeDTO = new ExtraIncomeDTO();

        SelectExtraIncomeBFFResponseDTO deleteExtraIncomeBFFResponseDTO = new SelectExtraIncomeBFFResponseDTO();

        Mockito.when(selectExtraIncomeBFFService.selectExtraIncomeBFFService(Mockito.any())).thenReturn(deleteExtraIncomeBFFResponseDTO);

        Assertions.assertNotNull(controller.selectExtraIncome(extraIncomeDTO));
    }

    @Test
    void updateExtraIncomeTest() {

        ExtraIncomeDTO extraIncomeDTO = new ExtraIncomeDTO();

        UpdateExtraIncomeBFFResponseDTO deleteExtraIncomeBFFResponseDTO = new UpdateExtraIncomeBFFResponseDTO();

        Mockito.when(updateExtraIncomeBFFService.updateExtraIncomeBFFService(Mockito.any())).thenReturn(deleteExtraIncomeBFFResponseDTO);

        Assertions.assertNotNull(controller.updateExtraIncome(extraIncomeDTO));
    }

}
