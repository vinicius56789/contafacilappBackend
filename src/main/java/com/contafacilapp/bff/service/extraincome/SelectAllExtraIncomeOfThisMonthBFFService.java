package com.contafacilapp.bff.service.extraincome;

import com.contafacilapp.bff.dto.extraincome.ExtraIncomeDTO;
import com.contafacilapp.bff.dto.extraincome.SelectAllExtraIncomeOfThisMonthBFFResponseDTO;

public interface SelectAllExtraIncomeOfThisMonthBFFService {

    SelectAllExtraIncomeOfThisMonthBFFResponseDTO selectAllExtraIncomeOfThisMonthBFFService(ExtraIncomeDTO extraIncomeDTO);

}
