package com.contafacilapp.bff.service.extraincome;

import com.contafacilapp.bff.dto.extraincome.ExtraIncomeDTO;
import com.contafacilapp.bff.dto.extraincome.SelectAllExtraIncomeBFFResponseDTO;

public interface SelectAllExtraIncomeBFFService {

    SelectAllExtraIncomeBFFResponseDTO selectAllExtraIncomeBFFService(ExtraIncomeDTO extraIncomeDTO);
}
