package com.contafacilapp.bff.service.bill;

import com.contafacilapp.bff.dto.bill.BillDTO;
import com.contafacilapp.bff.dto.bill.UpdateBillBFFResponseDTO;

public interface UpdateBillBFFService {

    UpdateBillBFFResponseDTO updateBillBFFService(BillDTO billDTO);
}
