package com.contafacilapp.bff.mapper.bill;

import com.contafacilapp.bff.dto.bill.UpdateBillBFFResponseDTO;
import com.contafacilapp.util.ConstantsIntegerUtils;
import com.contafacilapp.util.ConstantsStringUtils;

public class UpdateBillBFFResponseMapper {

    private UpdateBillBFFResponseDTO responseBFF = new UpdateBillBFFResponseDTO();

    public UpdateBillBFFResponseMapper(int updateBill) {

        if(ConstantsIntegerUtils.ZERO.equals(updateBill)) {
            responseBFF.setReturnMessage(ConstantsStringUtils.NOUPDATEBILL);
        } else {
            responseBFF.setReturnMessage(ConstantsStringUtils.UPDATEBILL);
        }

    }

    public UpdateBillBFFResponseDTO toFrontEndDTO() {
        return responseBFF;
    }
}
