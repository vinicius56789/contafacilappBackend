package com.contafacilapp.bff.service.monthlyincome;

import com.contafacilapp.bff.dto.monthlyincome.MonthlyIncomeDTO;
import com.contafacilapp.bff.dto.monthlyincome.SelectMonthlyIncomeBFFResponseDTO;

public interface SelectMonthlyIncomeBFFService {

    SelectMonthlyIncomeBFFResponseDTO selectMonthlyIncomeBFFService(MonthlyIncomeDTO monthlyIncomeDTO);
}
