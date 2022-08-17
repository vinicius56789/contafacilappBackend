package com.contafacilapp.bff.mapper.bill;

import com.contafacilapp.bff.dto.bill.BillDTO;
import com.contafacilapp.model.Bill;
import com.contafacilapp.model.Category;

public class UpdateBillBFFRequestMapper {

    private Bill requestBS = new Bill();

    public UpdateBillBFFRequestMapper(BillDTO billDTO) {

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

        Category category = new Category();
        category.setId(Long.valueOf(billDTO.getCategoryId()));
        requestBS.setCategory(category);

        requestBS.setId(Long.valueOf(billDTO.getBillId()));

    }

    public Bill toBusinessDTO() {
        return requestBS;
    }
}
