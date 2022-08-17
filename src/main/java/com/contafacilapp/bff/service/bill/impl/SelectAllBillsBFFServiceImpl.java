package com.contafacilapp.bff.service.bill.impl;

import com.contafacilapp.bff.dto.bill.BillDTO;
import com.contafacilapp.bff.dto.bill.SelectAllBillsBFFResponseDTO;
import com.contafacilapp.bff.mapper.bill.SelectAllBillsBFFRequestMapper;
import com.contafacilapp.bff.mapper.bill.SelectAllBillsBFFResponseMapper;
import com.contafacilapp.bff.service.bill.SelectAllBillsBFFService;
import com.contafacilapp.bs.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SelectAllBillsBFFServiceImpl implements SelectAllBillsBFFService {

    @Autowired
    private BillService billService;

    @Override
    public SelectAllBillsBFFResponseDTO selectAllBillsBFFService(BillDTO billDTO) {

        return new SelectAllBillsBFFResponseMapper(
                billService.selectAllBills(
                        new SelectAllBillsBFFRequestMapper(billDTO)
                                .toBusinessDTO())).FrontEndDTO();
    }
}
