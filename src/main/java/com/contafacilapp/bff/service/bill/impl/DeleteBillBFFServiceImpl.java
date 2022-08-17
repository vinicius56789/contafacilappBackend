package com.contafacilapp.bff.service.bill.impl;

import com.contafacilapp.bff.dto.bill.BillDTO;
import com.contafacilapp.bff.dto.bill.DeleteBillBFFResponseDTO;
import com.contafacilapp.bff.mapper.bill.DeleteBillBFFRequestMapper;
import com.contafacilapp.bff.mapper.bill.DeleteBillBFFResponseMapper;
import com.contafacilapp.bff.service.bill.DeleteBillBFFService;
import com.contafacilapp.bs.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteBillBFFServiceImpl implements DeleteBillBFFService {

    @Autowired
    private BillService billService;

    @Override
    public DeleteBillBFFResponseDTO deleteBillBFFService(BillDTO billDTO) {

        return new DeleteBillBFFResponseMapper(
                billService.deleteBill(
                        new DeleteBillBFFRequestMapper(billDTO)
                                .toBusinessDTO())).FrontEndDTO();
    }
}
