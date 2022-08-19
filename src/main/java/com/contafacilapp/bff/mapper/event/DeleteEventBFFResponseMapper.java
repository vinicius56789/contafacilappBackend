package com.contafacilapp.bff.mapper.event;

import com.contafacilapp.bff.dto.event.DeleteEventBFFResponseDTO;
import com.contafacilapp.util.ConstantsIntegerUtils;
import com.contafacilapp.util.ConstantsStringUtils;

public class DeleteEventBFFResponseMapper {

    private DeleteEventBFFResponseDTO responseBFF = new DeleteEventBFFResponseDTO();

    public DeleteEventBFFResponseMapper(int deleteEvent) {

        if(ConstantsIntegerUtils.ZERO.equals(deleteEvent)) {
            responseBFF.setReturnMessage(ConstantsStringUtils.NODELEVENT);
        } else {
            responseBFF.setReturnMessage(ConstantsStringUtils.DELEVENT);
        }

    }

    public DeleteEventBFFResponseDTO toFrontEndDTO() {
        return responseBFF;
    }
}
