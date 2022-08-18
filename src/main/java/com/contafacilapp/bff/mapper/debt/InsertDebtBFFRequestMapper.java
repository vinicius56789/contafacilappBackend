package com.contafacilapp.bff.mapper.debt;

import com.contafacilapp.bff.dto.debt.DebtDTO;
import com.contafacilapp.model.Client;
import com.contafacilapp.model.Debt;

public class InsertDebtBFFRequestMapper {

    private Debt requestBS = new Debt();

    public InsertDebtBFFRequestMapper(DebtDTO debtDTO) {

        Client client = new Client();
        client.setId(Long.valueOf(debtDTO.getClientId()));
        requestBS.setClient(client);

        requestBS.setMonthlyInterest(debtDTO.getMonthlyInterest());
        requestBS.setValue(debtDTO.getValue());
    }

    public Debt toBusinessDTO() {
        return requestBS;
    }
}
