package com.contafacilapp.controller;

import com.contafacilapp.bff.dto.bill.*;
import com.contafacilapp.bff.service.bill.*;
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
public class BillControllerTest {

    @Mock
    private DeleteBillBFFService deleteBillBFFService;

    @Mock
    private InsertBillBFFService insertBillBFFService;

    @Mock
    private SelectAllBillsBFFService selectAllBillsBFFService;

    @Mock
    private SelectBillBFFService selectBillBFFService;

    @Mock
    private UpdateBillBFFService updateBillBFFService;

    @InjectMocks
    private BillController controller;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void deleteBillTest() {

        BillDTO billDTO = new BillDTO();

        DeleteBillBFFResponseDTO responseDTO = new DeleteBillBFFResponseDTO();

        Mockito.when(deleteBillBFFService.deleteBillBFFService(Mockito.any())).thenReturn(responseDTO);

        Assertions.assertNotNull(controller.deleteBill(billDTO));
    }

    @Test
    void insertBillTest() {

        BillDTO billDTO = new BillDTO();

        InsertBillBFFResponseDTO responseDTO = new InsertBillBFFResponseDTO();

        Mockito.when(insertBillBFFService.insertBillBFFService(Mockito.any())).thenReturn(responseDTO);

        Assertions.assertNotNull(controller.insertBill(billDTO));
    }

    @Test
    void selectAllBillsTest() {

        BillDTO billDTO = new BillDTO();

        SelectAllBillsBFFResponseDTO responseDTO = new SelectAllBillsBFFResponseDTO();

        Mockito.when(selectAllBillsBFFService.selectAllBillsBFFService(Mockito.any())).thenReturn(responseDTO);

        Assertions.assertNotNull(controller.selectAllBills(billDTO));
    }

    @Test
    void selectBillTest() {

        BillDTO billDTO = new BillDTO();

        SelectBillBFFResponseDTO responseDTO = new SelectBillBFFResponseDTO();

        Mockito.when(selectBillBFFService.selectBillBFFService(Mockito.any())).thenReturn(responseDTO);

        Assertions.assertNotNull(controller.selectBill(billDTO));
    }

    @Test
    void updateBillTest() {

        BillDTO billDTO = new BillDTO();

        UpdateBillBFFResponseDTO responseDTO = new UpdateBillBFFResponseDTO();

        Mockito.when(updateBillBFFService.updateBillBFFService(Mockito.any())).thenReturn(responseDTO);

        Assertions.assertNotNull(controller.updateBill(billDTO));
    }
}
