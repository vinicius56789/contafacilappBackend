package com.contafacilapp.bff.service.extraincome;

import com.contafacilapp.bff.dto.extraincome.ExtraIncomeDTO;
import com.contafacilapp.bff.dto.extraincome.InsertExtraIncomeBFFResponseDTO;

public interface InsertExtraIncomeBFFService {

    InsertExtraIncomeBFFResponseDTO insertExtraIncomeBFFService(ExtraIncomeDTO extraIncomeDTO);
}
