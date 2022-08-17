package com.contafacilapp.bff.mapper.bill;

import com.contafacilapp.bff.dto.bill.BillDTO;
import com.contafacilapp.model.Bill;

public class DeleteBillBFFRequestMapper {

    private Bill requestBS = new Bill();

    public DeleteBillBFFRequestMapper(BillDTO billDTO) {

        requestBS.setId(Long.valueOf(billDTO.getBillId()));

    }

    public Bill toBusinessDTO() {
        return requestBS;
    }
}
