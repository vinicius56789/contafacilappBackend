package com.contafacilapp.bff.mapper.monthlyincome;

import com.contafacilapp.bff.dto.monthlyincome.UpdateMonthlyIncomeBFFResponseDTO;
import com.contafacilapp.util.ConstantsIntegerUtils;
import com.contafacilapp.util.ConstantsStringUtils;

public class UpdateMonthlyIncomeBFFResponseMapper {

    private UpdateMonthlyIncomeBFFResponseDTO responseBFF = new UpdateMonthlyIncomeBFFResponseDTO();

    public UpdateMonthlyIncomeBFFResponseMapper(int updateMonthlyIncome) {

        if(ConstantsIntegerUtils.ZERO.equals(updateMonthlyIncome)) {
            responseBFF.setReturnMessage(ConstantsStringUtils.NOUPDATEMONTHLYINCOME);
        } else {
            responseBFF.setReturnMessage(ConstantsStringUtils.UPDATEMONTHLYINCOME);
        }

    }

    public UpdateMonthlyIncomeBFFResponseDTO toFrontEndDTO() {
        return responseBFF;
    }
}
