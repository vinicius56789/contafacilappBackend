package com.contafacilapp.bff.service.debt;

import com.contafacilapp.bff.dto.debt.DebtDTO;
import com.contafacilapp.bff.dto.debt.DeleteDebtBFFResponseDTO;

public interface DeleteDebtBFFService {

    DeleteDebtBFFResponseDTO deleteDebtBFFService(DebtDTO debtDTO);

}
