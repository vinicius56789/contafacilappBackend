package com.contafacilapp.bff.service.bill.impl;

import com.contafacilapp.bff.dto.bill.BillDTO;
import com.contafacilapp.bff.dto.bill.UpdateBillBFFResponseDTO;
import com.contafacilapp.bff.mapper.bill.UpdateBillBFFRequestMapper;
import com.contafacilapp.bff.mapper.bill.UpdateBillBFFResponseMapper;
import com.contafacilapp.bff.service.bill.UpdateBillBFFService;
import com.contafacilapp.bs.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateBillBFFServiceImpl implements UpdateBillBFFService {

    @Autowired
    private BillService billService;

    @Override
    public UpdateBillBFFResponseDTO updateBillBFFService(BillDTO billDTO) {

        return new UpdateBillBFFResponseMapper(
                billService.updateBill(
                        new UpdateBillBFFRequestMapper(billDTO)
                                .toBusinessDTO())).toFrontEndDTO();
    }
}
