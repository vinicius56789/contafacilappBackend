package com.contafacilapp.bff.service.bill.impl;

import com.contafacilapp.bff.dto.bill.BillDTO;
import com.contafacilapp.bff.dto.bill.InsertBillBFFResponseDTO;
import com.contafacilapp.bff.mapper.bill.InsertBillBFFRequestMapper;
import com.contafacilapp.bff.mapper.bill.InsertBillBFFResponseMapper;
import com.contafacilapp.bff.service.bill.InsertBillBFFService;
import com.contafacilapp.bs.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InsertBillBFFServiceImpl implements InsertBillBFFService {

    @Autowired
    private BillService billService;

    @Override
    public InsertBillBFFResponseDTO insertBillBFFService(BillDTO billDTO) {

        return new InsertBillBFFResponseMapper(
                billService.insertBill(
                        new InsertBillBFFRequestMapper(billDTO)
                                .toBusinessDTO())).toFrontEndDTO();
    }
}
