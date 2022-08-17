package com.contafacilapp.bff.service.debt;

import com.contafacilapp.bff.dto.debt.DebtDTO;
import com.contafacilapp.bff.dto.debt.InsertDebtBFFResponseDTO;

public interface InsertDebtBFFService {

    InsertDebtBFFResponseDTO insertDebtBFFService(DebtDTO debtDTO);

}
