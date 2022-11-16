package com.contafacilapp.bff.service.impl.bill;

import com.contafacilapp.bff.dto.bill.BillDTO;
import com.contafacilapp.bff.service.bill.impl.SelectAllBillsBFFServiceImpl;
import com.contafacilapp.bs.BillService;
import com.contafacilapp.model.Bill;
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
public class SelectAllBillsBFFServiceImplTest {

    @Mock
    private BillService billService;

    @InjectMocks
    private SelectAllBillsBFFServiceImpl service;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void selectAllBillsBFFServiceTest() {

        BillDTO billDTO = new BillDTO();
        billDTO.setClientId("1");

        List<Bill> bills = new ArrayList<>();
        Bill bill = new Bill();
        bills.add(bill);

        Mockito.when(billService.selectAllBills(Mockito.any())).thenReturn(bills);

        service.selectAllBillsBFFService(billDTO);
    }
}
