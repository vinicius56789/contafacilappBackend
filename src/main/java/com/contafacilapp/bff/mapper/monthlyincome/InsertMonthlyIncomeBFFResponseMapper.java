package com.contafacilapp.bff.mapper.monthlyincome;

import com.contafacilapp.bff.dto.monthlyincome.InsertMonthlyIncomeBFFResponseDTO;
import com.contafacilapp.util.ConstantsIntegerUtils;
import com.contafacilapp.util.ConstantsStringUtils;

public class InsertMonthlyIncomeBFFResponseMapper {

    private InsertMonthlyIncomeBFFResponseDTO responseBFF = new InsertMonthlyIncomeBFFResponseDTO();

    public InsertMonthlyIncomeBFFResponseMapper(int insertMonthlyIncome) {

        if(ConstantsIntegerUtils.ZERO.equals(insertMonthlyIncome)) {
            responseBFF.setReturnMessage(ConstantsStringUtils.NOINSERTMONTHLYINCOME);
        } else {
            responseBFF.setReturnMessage(ConstantsStringUtils.INSERTMONTHLYINCOME);
        }

    }

    public InsertMonthlyIncomeBFFResponseDTO toFrontEndDTO() {
        return responseBFF;
    }
}
