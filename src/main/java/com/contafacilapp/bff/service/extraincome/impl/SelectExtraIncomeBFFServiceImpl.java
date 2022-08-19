package com.contafacilapp.bff.service.extraincome.impl;

import com.contafacilapp.bff.dto.extraincome.ExtraIncomeDTO;
import com.contafacilapp.bff.dto.extraincome.SelectExtraIncomeBFFResponseDTO;
import com.contafacilapp.bff.mapper.extraincome.SelectExtraIncomeBFFRequestMapper;
import com.contafacilapp.bff.mapper.extraincome.SelectExtraIncomeBFFResponseMapper;
import com.contafacilapp.bff.service.extraincome.SelectExtraIncomeBFFService;
import com.contafacilapp.bs.ExtraIncomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SelectExtraIncomeBFFServiceImpl implements SelectExtraIncomeBFFService {

    @Autowired
    private ExtraIncomeService extraIncomeService;

    @Override
    public SelectExtraIncomeBFFResponseDTO selectExtraIncomeBFFService(ExtraIncomeDTO extraIncomeDTO) {

        return new SelectExtraIncomeBFFResponseMapper(
                extraIncomeService.selectExtraIncome(
                        new SelectExtraIncomeBFFRequestMapper(extraIncomeDTO)
                                .toBusinessDTO())).toFrontEndDTO();
    }
}
