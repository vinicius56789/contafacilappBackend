package com.contafacilapp.bff.mapper.debt;

import com.contafacilapp.bff.dto.debt.DeleteDebtBFFResponseDTO;
import com.contafacilapp.util.ConstantsIntegerUtils;
import com.contafacilapp.util.ConstantsStringUtils;

public class DeleteDebtBFFResponseMapper {

    private DeleteDebtBFFResponseDTO responseBFF = new DeleteDebtBFFResponseDTO();

    public DeleteDebtBFFResponseMapper(int deleteDebt) {

        if(ConstantsIntegerUtils.ZERO.equals(deleteDebt)) {
            responseBFF.setReturnMessage(ConstantsStringUtils.NODELDEBT);
        } else {
            responseBFF.setReturnMessage(ConstantsStringUtils.DELDEBT);
        }

    }

    public DeleteDebtBFFResponseDTO toFrontEndDTO() {
        return responseBFF;
    }
}
