package com.contafacilapp.bff.mapper.extraincome;

import com.contafacilapp.bff.dto.extraincome.ExtraIncomeDTO;
import com.contafacilapp.bff.dto.extraincome.SelectAllExtraIncomeOfThisMonthBFFResponseDTO;
import com.contafacilapp.model.ExtraIncome;

import java.util.ArrayList;
import java.util.List;

public class SelectAllExtraIncomeOfThisMonthBFFResponseMapper {

    private SelectAllExtraIncomeOfThisMonthBFFResponseDTO responseBFF = new SelectAllExtraIncomeOfThisMonthBFFResponseDTO();

    public SelectAllExtraIncomeOfThisMonthBFFResponseMapper(List<ExtraIncome> selectAllExtraIncomeOfThisMonth) {

        List<ExtraIncomeDTO> content = new ArrayList<>();

        for (ExtraIncome extraIncome : selectAllExtraIncomeOfThisMonth) {

            ExtraIncomeDTO item = new ExtraIncomeDTO();
            item.setExtraIncomeId(String.valueOf(extraIncome.getId()));
            item.setMonth(extraIncome.getMonth());
            item.setYear(extraIncome.getYear());
            item.setValue(extraIncome.getValue());
            item.setName(extraIncome.getName());
            item.setDescription(extraIncome.getDescription());
            content.add(item);

        }

        responseBFF.setContent(content);

    }

    public SelectAllExtraIncomeOfThisMonthBFFResponseDTO toFrontEndDTO() {
        return responseBFF;
    }
}
