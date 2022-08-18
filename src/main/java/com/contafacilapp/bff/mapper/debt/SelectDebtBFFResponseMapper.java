package com.contafacilapp.bff.mapper.debt;

import com.contafacilapp.bff.dto.debt.DebtDTO;
import com.contafacilapp.bff.dto.debt.SelectDebtBFFResponseDTO;
import com.contafacilapp.model.Debt;

public class SelectDebtBFFResponseMapper {

    private SelectDebtBFFResponseDTO responseBFF = new SelectDebtBFFResponseDTO();

    public SelectDebtBFFResponseMapper(Debt selectDebt) {

        DebtDTO content = new DebtDTO();
        content.setValue(selectDebt.getValue());
        content.setMonthlyInterest(selectDebt.getMonthlyInterest());

        responseBFF.setContent(content);

    }

    public SelectDebtBFFResponseDTO toFrontEndDTO() {
        return responseBFF;
    }
}
