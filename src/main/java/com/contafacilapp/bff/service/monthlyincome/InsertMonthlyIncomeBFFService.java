package com.contafacilapp.bff.service.monthlyincome;

import com.contafacilapp.bff.dto.monthlyincome.InsertMonthlyIncomeBFFResponseDTO;
import com.contafacilapp.bff.dto.monthlyincome.MonthlyIncomeDTO;

public interface InsertMonthlyIncomeBFFService {

    InsertMonthlyIncomeBFFResponseDTO insertMonthlyIncomeBFFService(MonthlyIncomeDTO monthlyIncomeDTO);
}
