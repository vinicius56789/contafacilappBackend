package com.contafacilapp.bff.mapper.debt;

import com.contafacilapp.bff.dto.debt.UpdateDebtBFFResponseDTO;
import com.contafacilapp.util.ConstantsIntegerUtils;
import com.contafacilapp.util.ConstantsStringUtils;

public class UpdateDebtBFFResponseMapper {

    private UpdateDebtBFFResponseDTO responseBFF = new UpdateDebtBFFResponseDTO();

    public UpdateDebtBFFResponseMapper(int updateDebt) {

        if(ConstantsIntegerUtils.ZERO.equals(updateDebt)) {
            responseBFF.setReturnMessage(ConstantsStringUtils.NOUPDATEDEBT);
        } else {
            responseBFF.setReturnMessage(ConstantsStringUtils.UPDATEDEBT);
        }

    }

    public UpdateDebtBFFResponseDTO toFrontEndDTO() {
        return responseBFF;
    }
}
