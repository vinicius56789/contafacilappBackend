package com.contafacilapp.bff.service.extraincome;

import com.contafacilapp.bff.dto.extraincome.ExtraIncomeDTO;
import com.contafacilapp.bff.dto.extraincome.UpdateExtraIncomeBFFResponseDTO;

public interface UpdateExtraIncomeBFFService {

    UpdateExtraIncomeBFFResponseDTO updateExtraIncomeBFFService(ExtraIncomeDTO extraIncomeDTO);
}
