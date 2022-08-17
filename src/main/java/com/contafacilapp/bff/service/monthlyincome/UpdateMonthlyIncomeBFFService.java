package com.contafacilapp.bff.service.monthlyincome;

import com.contafacilapp.bff.dto.monthlyincome.MonthlyIncomeDTO;
import com.contafacilapp.bff.dto.monthlyincome.UpdateMonthlyIncomeBFFResponseDTO;

public interface UpdateMonthlyIncomeBFFService {

    UpdateMonthlyIncomeBFFResponseDTO updateMonthlyIncomeBFFService(MonthlyIncomeDTO monthlyIncomeDTO);
}
