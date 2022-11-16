package com.contafacilapp.bff.service.impl.bill;

import com.contafacilapp.bff.dto.bill.BillDTO;
import com.contafacilapp.bff.service.bill.impl.UpdateBillBFFServiceImpl;
import com.contafacilapp.bs.BillService;
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
public class UpdateBillBFFServiceImplTest {

    @Mock
    private BillService billService;

    @InjectMocks
    private UpdateBillBFFServiceImpl service;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void updateBillBFFServiceSuccessTest() {

        BillDTO billDTO = new BillDTO();
        billDTO.setBillId("1");
        billDTO.setCategoryId("1");

        Mockito.when(billService.updateBill(Mockito.any())).thenReturn(1);

        Assertions.assertNotNull(service.updateBillBFFService(billDTO));
    }

    @Test
    void updateBillBFFServiceErrorTest() {

        BillDTO billDTO = new BillDTO();
        billDTO.setBillId("1");
        billDTO.setCategoryId("1");

        Mockito.when(billService.updateBill(Mockito.any())).thenReturn(0);

        Assertions.assertNotNull(service.updateBillBFFService(billDTO));
    }

}
