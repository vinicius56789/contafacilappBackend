package com.contafacilapp.bff.service.debt;

import com.contafacilapp.bff.dto.debt.DebtDTO;
import com.contafacilapp.bff.dto.debt.SelectAllDebtsBFFResponseDTO;

public interface SelectAllDebtsBFFService {

    SelectAllDebtsBFFResponseDTO selectAllDebtsBFFService(DebtDTO debtDTO);

}
