package com.contafacilapp.bff.mapper.bill;

import com.contafacilapp.bff.dto.bill.BillDTO;
import com.contafacilapp.bff.dto.bill.SelectAllBillsBFFResponseDTO;
import com.contafacilapp.model.Bill;

import java.util.ArrayList;
import java.util.List;

public class SelectAllBillsBFFResponseMapper {

    private SelectAllBillsBFFResponseDTO responseBFF = new SelectAllBillsBFFResponseDTO();

    public SelectAllBillsBFFResponseMapper(List<Bill> selectAllBills) {

        List<BillDTO> content = new ArrayList<>();

        for(Bill bill : selectAllBills) {

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
            content.add(item);

        }

        responseBFF.setContent(content);
    }

    public SelectAllBillsBFFResponseDTO FrontEndDTO() {
        return responseBFF;
    }
}
