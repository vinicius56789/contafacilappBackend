package com.contafacilapp.bff.service.extraincome.impl;

import com.contafacilapp.bff.dto.extraincome.ExtraIncomeDTO;
import com.contafacilapp.bff.dto.extraincome.InsertExtraIncomeBFFResponseDTO;
import com.contafacilapp.bff.mapper.extraincome.InsertExtraIncomeBFFRequestMapper;
import com.contafacilapp.bff.mapper.extraincome.InsertExtraIncomeBFFResponseMapper;
import com.contafacilapp.bff.service.extraincome.InsertExtraIncomeBFFService;
import com.contafacilapp.bs.ExtraIncomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InsertExtraIncomeBFFServiceImpl implements InsertExtraIncomeBFFService {

    @Autowired
    private ExtraIncomeService extraIncomeService;

    @Override
    public InsertExtraIncomeBFFResponseDTO insertExtraIncomeBFFService(ExtraIncomeDTO extraIncomeDTO) {

        return new InsertExtraIncomeBFFResponseMapper(
                extraIncomeService.insertExtraIncome(
                        new InsertExtraIncomeBFFRequestMapper(extraIncomeDTO)
                                .toBusinessDTO())).toFrontEndDTO();
    }
}
