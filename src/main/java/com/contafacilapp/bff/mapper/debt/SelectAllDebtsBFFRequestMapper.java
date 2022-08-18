package com.contafacilapp.bff.mapper.debt;

import com.contafacilapp.bff.dto.debt.DebtDTO;
import com.contafacilapp.model.Client;
import com.contafacilapp.model.Debt;

public class SelectAllDebtsBFFRequestMapper {

    private Debt requestBS = new Debt();

    public SelectAllDebtsBFFRequestMapper(DebtDTO debtDTO) {

        Client client = new Client();
        client.setId(Long.valueOf(debtDTO.getClientId()));
        requestBS.setClient(client);

    }

    public Debt toBusinessDTO() {
        return requestBS;
    }
}
