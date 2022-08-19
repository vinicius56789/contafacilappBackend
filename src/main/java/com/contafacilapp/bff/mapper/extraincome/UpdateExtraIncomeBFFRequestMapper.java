package com.contafacilapp.bff.mapper.extraincome;

import com.contafacilapp.bff.dto.extraincome.ExtraIncomeDTO;
import com.contafacilapp.model.ExtraIncome;

public class UpdateExtraIncomeBFFRequestMapper {

    private ExtraIncome requestBS = new ExtraIncome();

    public UpdateExtraIncomeBFFRequestMapper(ExtraIncomeDTO extraIncomeDTO) {

        requestBS.setId(Long.valueOf(extraIncomeDTO.getExtraIncomeId()));
        requestBS.setValue(extraIncomeDTO.getValue());
        requestBS.setName(extraIncomeDTO.getName());
        requestBS.setDescription(extraIncomeDTO.getDescription());

    }

    public ExtraIncome toBusinessDTO() {
        return requestBS;
    }
}
