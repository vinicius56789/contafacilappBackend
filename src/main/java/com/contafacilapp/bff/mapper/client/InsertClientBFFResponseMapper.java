package com.contafacilapp.bff.mapper.client;

import com.contafacilapp.bff.dto.client.InsertClientBFFResponseDTO;
import com.contafacilapp.util.ConstantsIntegerUtils;
import com.contafacilapp.util.ConstantsStringUtils;

public class InsertClientBFFResponseMapper {

    private InsertClientBFFResponseDTO responseBFF = new InsertClientBFFResponseDTO();

    public InsertClientBFFResponseMapper(int insertClient) {

        if(ConstantsIntegerUtils.ZERO.equals(insertClient)) {
            responseBFF.setReturnMessage(ConstantsStringUtils.NOINSERTCLIENT);
        } else {
            responseBFF.setReturnMessage(ConstantsStringUtils.INSERTCLIENT);
        }

    }

    public InsertClientBFFResponseDTO toFrontEndDTO() {
        return responseBFF;
    }
}
