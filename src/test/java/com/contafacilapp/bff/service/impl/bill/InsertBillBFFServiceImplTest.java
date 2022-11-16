package com.contafacilapp.bff.service.impl.bill;

import com.contafacilapp.bff.dto.bill.BillDTO;
import com.contafacilapp.bff.service.bill.impl.InsertBillBFFServiceImpl;
import com.contafacilapp.bs.BillService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class InsertBillBFFServiceImplTest {

    @Mock
    private BillService billService;

    @InjectMocks
    private InsertBillBFFServiceImpl service;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void insertBillBFFServiceSuccessTest() {

        BillDTO billDTO = new BillDTO();
        billDTO.setValue("abc");
        billDTO.setTitle("abc");
        billDTO.setYear("abc");
        billDTO.setReminder("abc");
        billDTO.setPaid("abc");
        billDTO.setMonth("abc");
        billDTO.setDescription("abc");
        billDTO.setPaidMonth("abc");
        billDTO.setConstant(true);
        billDTO.setDueDate("abc");
        billDTO.setCategoryId("1");
        billDTO.setClientId("1");

        Mockito.when(billService.insertBill(Mockito.any())).thenReturn(1);

        service.insertBillBFFService(billDTO);
    }

    @Test
    void insertBillBFFServiceErrorTest() {

        BillDTO billDTO = new BillDTO();
        billDTO.setValue("abc");
        billDTO.setTitle("abc");
        billDTO.setYear("abc");
        billDTO.setReminder("abc");
        billDTO.setPaid("abc");
        billDTO.setMonth("abc");
        billDTO.setDescription("abc");
        billDTO.setPaidMonth("abc");
        billDTO.setConstant(true);
        billDTO.setDueDate("abc");
        billDTO.setCategoryId("1");
        billDTO.setClientId("1");

        Mockito.when(billService.insertBill(Mockito.any())).thenReturn(0);

        service.insertBillBFFService(billDTO);
    }
}
