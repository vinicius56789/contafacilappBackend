package com.contafacilapp.controller;

import com.contafacilapp.bff.dto.debt.*;
import com.contafacilapp.bff.service.debt.*;
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
public class DebtControllerTest {

    @Mock
    private DeleteDebtBFFService deleteDebtBFFService;

    @Mock
    private InsertDebtBFFService insertDebtBFFService;

    @Mock
    private SelectAllDebtsBFFService selectAllDebtsBFFService;

    @Mock
    private SelectDebtBFFService selectDebtBFFService;

    @Mock
    private UpdateDebtBFFService updateDebtBFFService;

    @InjectMocks
    private DebtController controller;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void deleteDebtTest() {

        DebtDTO debtDTO = new DebtDTO();

        DeleteDebtBFFResponseDTO deleteDebtBFFResponseDTO = new DeleteDebtBFFResponseDTO();

        Mockito.when(deleteDebtBFFService.deleteDebtBFFService(Mockito.any())).thenReturn(deleteDebtBFFResponseDTO);

        Assertions.assertNotNull(controller.deleteDebt(debtDTO));
    }

    @Test
    void insertDebtTest() {

        DebtDTO debtDTO = new DebtDTO();

        InsertDebtBFFResponseDTO deleteDebtBFFResponseDTO = new InsertDebtBFFResponseDTO();

        Mockito.when(insertDebtBFFService.insertDebtBFFService(Mockito.any())).thenReturn(deleteDebtBFFResponseDTO);

        Assertions.assertNotNull(controller.insertDebt(debtDTO));
    }

    @Test
    void selectAllDebtsTest() {

        DebtDTO debtDTO = new DebtDTO();

        SelectAllDebtsBFFResponseDTO deleteDebtBFFResponseDTO = new SelectAllDebtsBFFResponseDTO();

        Mockito.when(selectAllDebtsBFFService.selectAllDebtsBFFService(Mockito.any())).thenReturn(deleteDebtBFFResponseDTO);

        Assertions.assertNotNull(controller.selectAllDebts(debtDTO));
    }

    @Test
    void selectDebtTest() {

        DebtDTO debtDTO = new DebtDTO();

        SelectDebtBFFResponseDTO deleteDebtBFFResponseDTO = new SelectDebtBFFResponseDTO();

        Mockito.when(selectDebtBFFService.selectDebtBFFService(Mockito.any())).thenReturn(deleteDebtBFFResponseDTO);

        Assertions.assertNotNull(controller.selectDebt(debtDTO));
    }

    @Test
    void updateDebtTest() {

        DebtDTO debtDTO = new DebtDTO();

        UpdateDebtBFFResponseDTO deleteDebtBFFResponseDTO = new UpdateDebtBFFResponseDTO();

        Mockito.when(updateDebtBFFService.updateDebtBFFService(Mockito.any())).thenReturn(deleteDebtBFFResponseDTO);

        Assertions.assertNotNull(controller.updateDebt(debtDTO));
    }

}
