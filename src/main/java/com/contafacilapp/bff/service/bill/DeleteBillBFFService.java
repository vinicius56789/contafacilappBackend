package com.contafacilapp.bff.service.bill;

import com.contafacilapp.bff.dto.bill.BillDTO;
import com.contafacilapp.bff.dto.bill.DeleteBillBFFResponseDTO;

public interface DeleteBillBFFService {

    DeleteBillBFFResponseDTO deleteBillBFFService(BillDTO billDTO);
}
