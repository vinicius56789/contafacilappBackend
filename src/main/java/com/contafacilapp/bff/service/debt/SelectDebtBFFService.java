package com.contafacilapp.bff.service.debt;

import com.contafacilapp.bff.dto.debt.DebtDTO;
import com.contafacilapp.bff.dto.debt.SelectDebtBFFResponseDTO;

public interface SelectDebtBFFService {

    SelectDebtBFFResponseDTO selectDebtBFFService(DebtDTO debtDTO);

}
