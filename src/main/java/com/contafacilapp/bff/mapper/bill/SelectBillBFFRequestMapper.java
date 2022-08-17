package com.contafacilapp.bff.mapper.bill;

import com.contafacilapp.bff.dto.bill.BillDTO;
import com.contafacilapp.model.Bill;

public class SelectBillBFFRequestMapper {

    private Bill requestBS = new Bill();

    public SelectBillBFFRequestMapper(BillDTO billDTO) {

        requestBS.setId(Long.valueOf(billDTO.getBillId()));
    }

    public Bill toBusinessDTO() {
        return requestBS;
    }
}
