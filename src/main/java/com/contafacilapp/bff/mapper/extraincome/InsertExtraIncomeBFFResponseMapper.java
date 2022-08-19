package com.contafacilapp.bff.mapper.extraincome;

import com.contafacilapp.bff.dto.extraincome.InsertExtraIncomeBFFResponseDTO;
import com.contafacilapp.util.ConstantsIntegerUtils;
import com.contafacilapp.util.ConstantsStringUtils;

public class InsertExtraIncomeBFFResponseMapper {

    private InsertExtraIncomeBFFResponseDTO responseBFF = new InsertExtraIncomeBFFResponseDTO();

    public InsertExtraIncomeBFFResponseMapper(int insertExtraIncome) {

        if(ConstantsIntegerUtils.ZERO.equals(insertExtraIncome)) {
            responseBFF.setReturnMessage(ConstantsStringUtils.NOINSERTEXTRAINCOME);
        } else {
            responseBFF.setReturnMessage(ConstantsStringUtils.INSERTEXTRAINCOME);
        }

    }

    public InsertExtraIncomeBFFResponseDTO toFrontEndDTO() {
        return responseBFF;
    }
}
