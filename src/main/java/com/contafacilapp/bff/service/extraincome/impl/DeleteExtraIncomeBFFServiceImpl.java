package com.contafacilapp.bff.service.extraincome.impl;

import com.contafacilapp.bff.dto.extraincome.DeleteExtraIncomeBFFResponseDTO;
import com.contafacilapp.bff.dto.extraincome.ExtraIncomeDTO;
import com.contafacilapp.bff.mapper.extraincome.DeleteExtraIncomeBFFRequestMapper;
import com.contafacilapp.bff.mapper.extraincome.DeleteExtraIncomeBFFResponseMapper;
import com.contafacilapp.bff.service.extraincome.DeleteExtraIncomeBFFService;
import com.contafacilapp.bs.ExtraIncomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteExtraIncomeBFFServiceImpl implements DeleteExtraIncomeBFFService {

    @Autowired
    private ExtraIncomeService extraIncomeService;

    @Override
    public DeleteExtraIncomeBFFResponseDTO deleteExtraIncomeBFFService(ExtraIncomeDTO extraIncomeDTO) {

        return new DeleteExtraIncomeBFFResponseMapper(
                extraIncomeService.deleteExtraIncome(
                        new DeleteExtraIncomeBFFRequestMapper(extraIncomeDTO)
                                .toBusinessDTO())).toFrontEndDTO();
    }
}
