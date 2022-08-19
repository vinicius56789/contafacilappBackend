package com.contafacilapp.bff.mapper.extraincome;

import com.contafacilapp.bff.dto.extraincome.ExtraIncomeDTO;
import com.contafacilapp.bff.dto.extraincome.SelectExtraIncomeBFFResponseDTO;
import com.contafacilapp.model.ExtraIncome;

public class SelectExtraIncomeBFFResponseMapper {

    private SelectExtraIncomeBFFResponseDTO responseBFF = new SelectExtraIncomeBFFResponseDTO();

    public SelectExtraIncomeBFFResponseMapper(ExtraIncome selectExtraIncome) {

        ExtraIncomeDTO content = new ExtraIncomeDTO();
        content.setDescription(selectExtraIncome.getDescription());
        content.setName(selectExtraIncome.getName());
        content.setValue(selectExtraIncome.getValue());
        content.setYear(selectExtraIncome.getYear());
        content.setMonth(selectExtraIncome.getMonth());

        responseBFF.setContent(content);
    }

    public SelectExtraIncomeBFFResponseDTO toFrontEndDTO() {
        return responseBFF;
    }
}
