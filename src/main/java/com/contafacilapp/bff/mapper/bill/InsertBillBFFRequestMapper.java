package com.contafacilapp.bff.mapper.bill;

import com.contafacilapp.bff.dto.bill.BillDTO;
import com.contafacilapp.model.Bill;
import com.contafacilapp.model.Category;
import com.contafacilapp.model.Client;

public class InsertBillBFFRequestMapper {

    private Bill requestBS = new Bill();

    public InsertBillBFFRequestMapper(BillDTO billDTO) {

        Category category = new Category();
        category.setId(Long.valueOf(billDTO.getCategoryId()));
        requestBS.setCategory(category);

        Client client = new Client();
        client.setId(Long.valueOf(billDTO.getClientId()));
        requestBS.setClient(client);

        requestBS.setConstant(billDTO.getConstant());
        requestBS.setDescription(billDTO.getDescription());
        requestBS.setDueDate(billDTO.getDueDate());
        requestBS.setMonth(billDTO.getMonth());
        requestBS.setPaid(billDTO.getPaid());
        requestBS.setPaidMonth(billDTO.getPaidMonth());
        requestBS.setReminder(billDTO.getReminder());
        requestBS.setTitle(billDTO.getTitle());
        requestBS.setValue(billDTO.getValue());
        requestBS.setYear(billDTO.getYear());
    }

    public Bill toBusinessDTO() {
        return requestBS;
    }
}
