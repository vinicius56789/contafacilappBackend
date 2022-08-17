package com.contafacilapp.bff.service.bill;

import com.contafacilapp.bff.dto.bill.BillDTO;
import com.contafacilapp.bff.dto.bill.InsertBillBFFResponseDTO;

public interface InsertBillBFFService {

    InsertBillBFFResponseDTO insertBillBFFService(BillDTO billDTO);
}
