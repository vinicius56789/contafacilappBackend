package com.contafacilapp.bff.mapper.event;

import com.contafacilapp.bff.dto.event.InsertEventBFFResponseDTO;
import com.contafacilapp.util.ConstantsIntegerUtils;
import com.contafacilapp.util.ConstantsStringUtils;

public class InsertEventBFFResponseMapper {

    private InsertEventBFFResponseDTO responseBFF = new InsertEventBFFResponseDTO();

    public InsertEventBFFResponseMapper(int insertEvent) {

        if(ConstantsIntegerUtils.ZERO.equals(insertEvent)) {
            responseBFF.setReturnMessage(ConstantsStringUtils.NOINSERTEVENT);
        } else {
            responseBFF.setReturnMessage(ConstantsStringUtils.INSERTEVENT);
        }

    }

    public InsertEventBFFResponseDTO toFrontEndDTO() {
        return responseBFF;
    }
}
