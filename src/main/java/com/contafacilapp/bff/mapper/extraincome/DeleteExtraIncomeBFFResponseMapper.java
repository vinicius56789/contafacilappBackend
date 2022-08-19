package com.contafacilapp.bff.mapper.extraincome;

import com.contafacilapp.bff.dto.extraincome.DeleteExtraIncomeBFFResponseDTO;
import com.contafacilapp.util.ConstantsIntegerUtils;
import com.contafacilapp.util.ConstantsStringUtils;

public class DeleteExtraIncomeBFFResponseMapper {

    private DeleteExtraIncomeBFFResponseDTO responseBFF = new DeleteExtraIncomeBFFResponseDTO();

    public DeleteExtraIncomeBFFResponseMapper(int deleteExtraIncome) {

        if(ConstantsIntegerUtils.ZERO.equals(deleteExtraIncome)) {
            responseBFF.setReturnMessage(ConstantsStringUtils.NODELEXTRAINCOME);
        } else {
            responseBFF.setReturnMessage(ConstantsStringUtils.DELEXTRAINCOME);
        }

    }

    public DeleteExtraIncomeBFFResponseDTO toFrontEndDTO() {
        return responseBFF;
    }
}
