package com.contafacilapp.bff.service.extraincome;

import com.contafacilapp.bff.dto.extraincome.DeleteExtraIncomeBFFResponseDTO;
import com.contafacilapp.bff.dto.extraincome.ExtraIncomeDTO;

public interface DeleteExtraIncomeBFFService {

    DeleteExtraIncomeBFFResponseDTO deleteExtraIncomeBFFService(ExtraIncomeDTO extraIncomeDTO);
}
