package com.contafacilapp.bs.impl;

import com.contafacilapp.bs.BillService;
import com.contafacilapp.model.Bill;
import com.contafacilapp.repository.BillRepositoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillServiceImpl implements BillService {

    @Autowired
    private BillRepositoryService gateway;

    @Override
    public List<Bill> selectAllBills(Bill bill) {
        return gateway.selectAllBills(bill);
    }

    @Override
    public Bill selectBill(Bill bill) {
        return gateway.selectBill(bill);
    }

    @Override
    public int updateBill(Bill bill) {
        return gateway.updateBill(bill);
    }

    @Override
    public int deleteBill(Bill bill) {
        return gateway.deleteBill(bill);
    }

    @Override
    public int insertBill(Bill bill) {
        return gateway.insertBill(bill);
    }
}
