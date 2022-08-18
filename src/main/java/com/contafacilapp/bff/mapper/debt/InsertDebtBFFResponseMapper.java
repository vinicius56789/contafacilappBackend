package com.contafacilapp.bff.mapper.debt;

import com.contafacilapp.bff.dto.debt.InsertDebtBFFResponseDTO;
import com.contafacilapp.util.ConstantsIntegerUtils;
import com.contafacilapp.util.ConstantsStringUtils;

public class InsertDebtBFFResponseMapper {

    private InsertDebtBFFResponseDTO responseBFF = new InsertDebtBFFResponseDTO();

    public InsertDebtBFFResponseMapper(int insertDebt) {

        if(ConstantsIntegerUtils.ZERO.equals(insertDebt)) {
            responseBFF.setReturnMessage(ConstantsStringUtils.NOINSERTDEBT);
        } else {
            responseBFF.setReturnMessage(ConstantsStringUtils.INSERTDEBT);
        }

    }

    public InsertDebtBFFResponseDTO toFrontEndDTO() {
        return responseBFF;
    }
}
