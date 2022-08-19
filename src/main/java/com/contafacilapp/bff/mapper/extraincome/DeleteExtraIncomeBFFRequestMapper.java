package com.contafacilapp.bff.mapper.extraincome;

import com.contafacilapp.bff.dto.extraincome.ExtraIncomeDTO;
import com.contafacilapp.model.ExtraIncome;

public class DeleteExtraIncomeBFFRequestMapper {

    private ExtraIncome requestBS = new ExtraIncome();

    public DeleteExtraIncomeBFFRequestMapper(ExtraIncomeDTO extraIncomeDTO) {

        requestBS.setId(Long.valueOf(extraIncomeDTO.getExtraIncomeId()));

    }

    public ExtraIncome toBusinessDTO() {
        return requestBS;
    }
}
