package com.contafacilapp.bff.service.debt;

import com.contafacilapp.bff.dto.debt.DebtDTO;
import com.contafacilapp.bff.dto.debt.UpdateDebtBFFResponseDTO;

public interface UpdateDebtBFFService {

    UpdateDebtBFFResponseDTO updateDebtBFFService(DebtDTO debtDTO);
}
