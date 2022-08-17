package com.contafacilapp.bff.mapper.bill;

import com.contafacilapp.bff.dto.bill.InsertBillBFFResponseDTO;
import com.contafacilapp.util.ConstantsIntegerUtils;
import com.contafacilapp.util.ConstantsStringUtils;

public class InsertBillBFFResponseMapper {

    private InsertBillBFFResponseDTO responseBFF = new InsertBillBFFResponseDTO();

    public InsertBillBFFResponseMapper(int insertBill) {

        if(ConstantsIntegerUtils.ZERO.equals(insertBill)) {
            responseBFF.setReturnMessage(ConstantsStringUtils.NOINSERTBILL);
        } else {
            responseBFF.setReturnMessage(ConstantsStringUtils.INSERTBILL);
        }
    }

    public InsertBillBFFResponseDTO toFrontEndDTO() {
        return responseBFF;
    }
}
