package com.contafacilapp.bff.mapper.client;

import com.contafacilapp.bff.dto.client.UpdateClientBFFResponseDTO;
import com.contafacilapp.util.ConstantsIntegerUtils;
import com.contafacilapp.util.ConstantsStringUtils;

public class UpdateClientBFFResponseMapper {

    private UpdateClientBFFResponseDTO responseBFF = new UpdateClientBFFResponseDTO();

    public UpdateClientBFFResponseMapper(int updateClient) {

        if(ConstantsIntegerUtils.ZERO.equals(updateClient)) {
            responseBFF.setReturnMessage(ConstantsStringUtils.NOUPDATECLIENT);
        } else {
            responseBFF.setReturnMessage(ConstantsStringUtils.UPDATECLIENT);
        }

    }

    public UpdateClientBFFResponseDTO toFrontEndDTO() {
        return responseBFF;
    }
}
