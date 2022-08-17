package com.contafacilapp.bff.service.monthlyincome;

import com.contafacilapp.bff.dto.monthlyincome.MonthlyIncomeDTO;
import com.contafacilapp.bff.dto.monthlyincome.SelectCurrentMonthlyIncomeBFFResponseDTO;

public interface SelectCurrentMonthlyIncomeBFFService {

    SelectCurrentMonthlyIncomeBFFResponseDTO selectCurrentMonthlyIncomeBFFService(MonthlyIncomeDTO monthlyIncomeDTO);

}
