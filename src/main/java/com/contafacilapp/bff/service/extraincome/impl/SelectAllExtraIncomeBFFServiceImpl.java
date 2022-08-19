package com.contafacilapp.bff.service.extraincome.impl;

import com.contafacilapp.bff.dto.extraincome.ExtraIncomeDTO;
import com.contafacilapp.bff.dto.extraincome.SelectAllExtraIncomeBFFResponseDTO;
import com.contafacilapp.bff.mapper.extraincome.SelectAllExtraIncomeBFFRequestMapper;
import com.contafacilapp.bff.mapper.extraincome.SelectAllExtraIncomeBFFResponseMapper;
import com.contafacilapp.bff.service.extraincome.SelectAllExtraIncomeBFFService;
import com.contafacilapp.bs.ExtraIncomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SelectAllExtraIncomeBFFServiceImpl implements SelectAllExtraIncomeBFFService {

    @Autowired
    private ExtraIncomeService extraIncomeService;

    @Override
    public SelectAllExtraIncomeBFFResponseDTO selectAllExtraIncomeBFFService(ExtraIncomeDTO extraIncomeDTO) {

        return new SelectAllExtraIncomeBFFResponseMapper(
                extraIncomeService.selectAllExtraIncome(
                        new SelectAllExtraIncomeBFFRequestMapper(extraIncomeDTO)
                                .toBusinessDTO())).toFrontEndDTO();
    }
}
