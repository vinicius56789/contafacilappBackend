package com.contafacilapp.bff.service.impl.bill;

import com.contafacilapp.bff.dto.bill.BillDTO;
import com.contafacilapp.bff.service.bill.impl.SelectBillBFFServiceImpl;
import com.contafacilapp.bs.BillService;
import com.contafacilapp.model.Bill;
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
public class SelectBillBFFServiceImplTest {

    @Mock
    private BillService billService;

    @InjectMocks
    private SelectBillBFFServiceImpl service;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void SelectBillBFFServiceImplTest() {

        BillDTO billDTO = new BillDTO();
        billDTO.setBillId("1");

        Bill bill = new Bill();

        Mockito.when(billService.selectBill(Mockito.any())).thenReturn(bill);

        Assertions.assertNotNull(service.selectBillBFFService(billDTO));
    }
}
