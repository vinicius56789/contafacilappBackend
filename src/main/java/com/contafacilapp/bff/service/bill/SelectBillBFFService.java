package com.contafacilapp.bff.service.bill;

import com.contafacilapp.bff.dto.bill.BillDTO;
import com.contafacilapp.bff.dto.bill.SelectBillBFFResponseDTO;

public interface SelectBillBFFService {

    SelectBillBFFResponseDTO selectBillBFFService(BillDTO billDTO);
}
