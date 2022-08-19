package com.contafacilapp.bff.mapper.event;

import com.contafacilapp.bff.dto.event.UpdateEventBFFResponseDTO;
import com.contafacilapp.util.ConstantsIntegerUtils;
import com.contafacilapp.util.ConstantsStringUtils;

public class UpdateEventBFFResponseMapper {

    private UpdateEventBFFResponseDTO responseBFF = new UpdateEventBFFResponseDTO();

    public UpdateEventBFFResponseMapper(int updateEvent) {

        if(ConstantsIntegerUtils.ZERO.equals(updateEvent)) {
            responseBFF.setReturnMessage(ConstantsStringUtils.NOUPDATEEVENT);
        } else {
            responseBFF.setReturnMessage(ConstantsStringUtils.UPDATEEVENT);
        }
    }

    public UpdateEventBFFResponseDTO toFrontEndDTO() {
        return responseBFF;
    }
}
