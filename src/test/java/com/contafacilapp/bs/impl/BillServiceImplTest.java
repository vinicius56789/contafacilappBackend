package com.contafacilapp.bs.impl;

import com.contafacilapp.model.Bill;
import com.contafacilapp.repository.BillRepositoryService;
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
public class BillServiceImplTest {

    @Mock
    private BillRepositoryService gateway;

    @InjectMocks
    private BillServiceImpl service;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void selectAllBillsTest() {

        Bill bill = new Bill();

        List<Bill> bills = new ArrayList<>();

        Mockito.when(gateway.selectAllBills(Mockito.any())).thenReturn(bills);

        Assertions.assertNotNull(service.selectAllBills(bill));
    }

    @Test
    void selectBillTest() {

        Bill bill = new Bill();

        Mockito.when(gateway.selectBill(Mockito.any())).thenReturn(bill);

        Assertions.assertNotNull(service.selectBill(bill));
    }

    @Test
    void updateBillTest() {

        Bill bill = new Bill();

        Mockito.when(gateway.updateBill(Mockito.any())).thenReturn(1);

        Assertions.assertNotNull(service.updateBill(bill));
    }

    @Test
    void deleteBillTest() {

        Bill bill = new Bill();

        Mockito.when(gateway.deleteBill(Mockito.any())).thenReturn(1);

        Assertions.assertNotNull(service.deleteBill(bill));
    }

    @Test
    void insertBillTest() {

        Bill bill = new Bill();

        Mockito.when(gateway.insertBill(Mockito.any())).thenReturn(1);

        Assertions.assertNotNull(service.insertBill(bill));
    }
}
