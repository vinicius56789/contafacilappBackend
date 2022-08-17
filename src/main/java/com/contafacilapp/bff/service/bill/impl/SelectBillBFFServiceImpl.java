package com.contafacilapp.bff.service.bill.impl;

import com.contafacilapp.bff.dto.bill.BillDTO;
import com.contafacilapp.bff.dto.bill.SelectBillBFFResponseDTO;
import com.contafacilapp.bff.mapper.bill.SelectBillBFFRequestMapper;
import com.contafacilapp.bff.mapper.bill.SelectBillBFFResponseMapper;
import com.contafacilapp.bff.service.bill.SelectBillBFFService;
import com.contafacilapp.bs.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SelectBillBFFServiceImpl implements SelectBillBFFService {

    @Autowired
    private BillService billService;

    @Override
    public SelectBillBFFResponseDTO selectBillBFFService(BillDTO billDTO) {

        return new SelectBillBFFResponseMapper(
                billService.selectBill(
                        new SelectBillBFFRequestMapper(billDTO)
                                .toBusinessDTO())).toFrontEndDTO();
    }
}
