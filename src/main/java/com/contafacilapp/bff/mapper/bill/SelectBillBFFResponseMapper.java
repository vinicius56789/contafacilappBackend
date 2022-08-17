package com.contafacilapp.bff.mapper.bill;

import com.contafacilapp.bff.dto.bill.BillDTO;
import com.contafacilapp.bff.dto.bill.SelectBillBFFResponseDTO;
import com.contafacilapp.model.Bill;

public class SelectBillBFFResponseMapper {

    private SelectBillBFFResponseDTO responseBFF = new SelectBillBFFResponseDTO();

    public SelectBillBFFResponseMapper(Bill bill) {

        BillDTO item = new BillDTO();
        item.setConstant(bill.getConstant());
        item.setDescription(bill.getDescription());
        item.setDueDate(bill.getDueDate());
        item.setMonth(bill.getMonth());
        item.setPaid(bill.getPaid());
        item.setPaidMonth(bill.getPaidMonth());
        item.setReminder(bill.getReminder());
        item.setTitle(bill.getTitle());
        item.setValue(bill.getValue());
        item.setYear(bill.getYear());

        responseBFF.setContent(item);
    }

    public SelectBillBFFResponseDTO toFrontEndDTO() {
        return responseBFF;
    }
}
