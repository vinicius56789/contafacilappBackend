package com.contafacilapp.bff.mapper.extraincome;

import com.contafacilapp.bff.dto.extraincome.UpdateExtraIncomeBFFResponseDTO;
import com.contafacilapp.util.ConstantsIntegerUtils;
import com.contafacilapp.util.ConstantsStringUtils;

public class UpdateExtraIncomeBFFResponseMapper {

    private UpdateExtraIncomeBFFResponseDTO responseBFF = new UpdateExtraIncomeBFFResponseDTO();

    public UpdateExtraIncomeBFFResponseMapper(int updateExtraIncome) {

        if(ConstantsIntegerUtils.ZERO.equals(updateExtraIncome)) {
            responseBFF.setReturnMessage(ConstantsStringUtils.NOUPDATEEXTRAINCOME);
        } else {
            responseBFF.setReturnMessage(ConstantsStringUtils.UPDATEEXTRAINCOME);
        }

    }

    public UpdateExtraIncomeBFFResponseDTO toFrontEndDTO() {
        return responseBFF;
    }
}
