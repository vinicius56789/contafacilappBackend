package com.contafacilapp.bff.mapper.monthlyincome;

import com.contafacilapp.bff.dto.monthlyincome.MonthlyIncomeDTO;
import com.contafacilapp.model.Client;
import com.contafacilapp.model.MonthlyIncome;

public class SelectCurrentMonthlyIncomeBFFRequestMapper {

    private MonthlyIncome requestBS = new MonthlyIncome();

    public SelectCurrentMonthlyIncomeBFFRequestMapper(MonthlyIncomeDTO monthlyIncomeDTO) {

        Client client = new Client();
        client.setId(Long.valueOf(monthlyIncomeDTO.getClientId()));
        requestBS.setClient(client);

    }

    public MonthlyIncome toBusinessDTO() {
        return requestBS;
    }
}
