package com.contafacilapp.bff.service.extraincome;

import com.contafacilapp.bff.dto.extraincome.ExtraIncomeDTO;
import com.contafacilapp.bff.dto.extraincome.SelectExtraIncomeBFFResponseDTO;

public interface SelectExtraIncomeBFFService {

    SelectExtraIncomeBFFResponseDTO selectExtraIncomeBFFService(ExtraIncomeDTO extraIncomeDTO);
}
