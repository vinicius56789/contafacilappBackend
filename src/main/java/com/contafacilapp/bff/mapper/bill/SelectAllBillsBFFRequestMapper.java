package com.contafacilapp.bff.mapper.bill;

import com.contafacilapp.bff.dto.bill.BillDTO;
import com.contafacilapp.model.Bill;
import com.contafacilapp.model.Client;

public class SelectAllBillsBFFRequestMapper {

    private Bill requestBS = new Bill();

    public SelectAllBillsBFFRequestMapper(BillDTO billDTO) {

        Client client = new Client();
        client.setId(Long.valueOf(billDTO.getClientId()));
        requestBS.setClient(client);

    }

    public Bill toBusinessDTO() {
        return requestBS;
    }
}
