package com.contafacilapp.bff.service.bill;

import com.contafacilapp.bff.dto.bill.BillDTO;
import com.contafacilapp.bff.dto.bill.SelectAllBillsBFFResponseDTO;

public interface SelectAllBillsBFFService {

    SelectAllBillsBFFResponseDTO selectAllBillsBFFService(BillDTO billDTO);
}
