package com.contafacilapp.bff.mapper.bill;

import com.contafacilapp.bff.dto.bill.DeleteBillBFFResponseDTO;
import com.contafacilapp.util.ConstantsIntegerUtils;
import com.contafacilapp.util.ConstantsStringUtils;

public class DeleteBillBFFResponseMapper {

    private DeleteBillBFFResponseDTO responseBFF = new DeleteBillBFFResponseDTO();

    public DeleteBillBFFResponseMapper(int deleteBill) {

        if(ConstantsIntegerUtils.ZERO.equals(deleteBill)) {
            responseBFF.setReturnMessage(ConstantsStringUtils.NODELBILL);
        } else {
            responseBFF.setReturnMessage(ConstantsStringUtils.DELBILL);
        }

    }

    public DeleteBillBFFResponseDTO FrontEndDTO() {
        return responseBFF;
    }
}
