package com.contafacilapp.repository;

import com.contafacilapp.model.Bill;

import java.util.List;

public interface BillRepositoryService {

    List<Bill> selectAllBills(Bill bill);

    Bill selectBill(Bill bill);

    int updateBill(Bill bill);

    int deleteBill(Bill bill);

    int insertBill(Bill bill);

}
