package com.contafacilapp.bff.service.monthlyincome;

import com.contafacilapp.bff.dto.monthlyincome.MonthlyIncomeDTO;
import com.contafacilapp.bff.dto.monthlyincome.SelectAllMonthlyIncomeBFFResponseDTO;

public interface SelectAllMonthlyIncomeBFFService {

    SelectAllMonthlyIncomeBFFResponseDTO selectAllMonthlyIncomeBFFService(MonthlyIncomeDTO monthlyIncomeDTO);

}
