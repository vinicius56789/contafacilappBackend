package com.contafacilapp.bff.mapper.event;

import com.contafacilapp.bff.dto.bill.BillDTO;
import com.contafacilapp.bff.dto.event.SelectBillsFromEventBFFResponseDTO;
import com.contafacilapp.model.Bill;

import java.util.ArrayList;
import java.util.List;

public class SelectBillsFromEventBFFResponseMapper {

    private SelectBillsFromEventBFFResponseDTO responseBFF = new SelectBillsFromEventBFFResponseDTO();

    public SelectBillsFromEventBFFResponseMapper(List<Bill> selectBillsFromEvent) {

        List<BillDTO> bills = new ArrayList<>();

        for (Bill item : selectBillsFromEvent) {

            BillDTO bill = new BillDTO();
            bill.setTitle(item.getTitle());
            bill.setValue(item.getValue());
            bill.setBillId(String.valueOf(item.getId()));
            bills.add(bill);
        }

        responseBFF.setContent(bills);

    }

    public SelectBillsFromEventBFFResponseDTO toFrontEndDTO() {
        return responseBFF;
    }
}
