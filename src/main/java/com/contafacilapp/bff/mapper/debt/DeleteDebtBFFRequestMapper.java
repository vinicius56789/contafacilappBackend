package com.contafacilapp.bff.mapper.debt;

import com.contafacilapp.bff.dto.debt.DebtDTO;
import com.contafacilapp.model.Debt;

public class DeleteDebtBFFRequestMapper {

    private Debt requestBS = new Debt();

    public DeleteDebtBFFRequestMapper(DebtDTO debtDTO) {

        requestBS.setId(Long.valueOf(debtDTO.getDebtId()));

    }

    public Debt toBusinessDTO() {
        return requestBS;
    }
}
