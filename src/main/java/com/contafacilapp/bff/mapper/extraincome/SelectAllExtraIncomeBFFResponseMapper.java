package com.contafacilapp.bff.mapper.extraincome;

import com.contafacilapp.bff.dto.extraincome.ExtraIncomeDTO;
import com.contafacilapp.bff.dto.extraincome.SelectAllExtraIncomeBFFResponseDTO;
import com.contafacilapp.model.ExtraIncome;

import java.util.ArrayList;
import java.util.List;

public class SelectAllExtraIncomeBFFResponseMapper {

    private SelectAllExtraIncomeBFFResponseDTO responseBFF = new SelectAllExtraIncomeBFFResponseDTO();


    public SelectAllExtraIncomeBFFResponseMapper(List<ExtraIncome> selectAllExtraIncome) {


        List<ExtraIncomeDTO> content = new ArrayList<>();

        for(ExtraIncome extraIncome : selectAllExtraIncome) {

            ExtraIncomeDTO item = new ExtraIncomeDTO();
            item.setExtraIncomeId(String.valueOf(extraIncome.getId()));
            item.setDescription(extraIncome.getDescription());
            item.setMonth(extraIncome.getMonth());
            item.setYear(extraIncome.getYear());
            item.setName(extraIncome.getName());
            item.setValue(extraIncome.getValue());
            content.add(item);

        }

        responseBFF.setContent(content);

    }

    public SelectAllExtraIncomeBFFResponseDTO toFrontEndDTO() {
        return responseBFF;
    }
}
