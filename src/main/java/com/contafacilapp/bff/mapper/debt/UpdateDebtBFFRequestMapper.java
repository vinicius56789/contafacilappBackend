package com.contafacilapp.bff.mapper.debt;

import com.contafacilapp.bff.dto.debt.DebtDTO;
import com.contafacilapp.model.Debt;

public class UpdateDebtBFFRequestMapper {

    private Debt requestBS = new Debt();

    public UpdateDebtBFFRequestMapper(DebtDTO debtDTO) {

        requestBS.setValue(debtDTO.getValue());
        requestBS.setMonthlyInterest(debtDTO.getMonthlyInterest());
        requestBS.setId(Long.valueOf(debtDTO.getDebtId()));

    }

    public Debt toBusinessDTO() {
        return requestBS;
    }
}
