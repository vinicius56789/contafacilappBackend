package com.contafacilapp.bff.service.extraincome.impl;

import com.contafacilapp.bff.dto.extraincome.ExtraIncomeDTO;
import com.contafacilapp.bff.dto.extraincome.UpdateExtraIncomeBFFResponseDTO;
import com.contafacilapp.bff.mapper.extraincome.UpdateExtraIncomeBFFRequestMapper;
import com.contafacilapp.bff.mapper.extraincome.UpdateExtraIncomeBFFResponseMapper;
import com.contafacilapp.bff.service.extraincome.UpdateExtraIncomeBFFService;
import com.contafacilapp.bs.ExtraIncomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateExtraIncomeBFFServiceImpl implements UpdateExtraIncomeBFFService {

    @Autowired
    private ExtraIncomeService extraIncomeService;

    @Override
    public UpdateExtraIncomeBFFResponseDTO updateExtraIncomeBFFService(ExtraIncomeDTO extraIncomeDTO) {

        return new UpdateExtraIncomeBFFResponseMapper(
                extraIncomeService.updateExtraIncome(
                        new UpdateExtraIncomeBFFRequestMapper(extraIncomeDTO)
                                .toBusinessDTO())).toFrontEndDTO();
    }
}
