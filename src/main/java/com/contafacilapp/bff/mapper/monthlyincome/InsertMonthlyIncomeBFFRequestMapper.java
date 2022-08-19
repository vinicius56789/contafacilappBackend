package com.contafacilapp.bff.mapper.monthlyincome;

import com.contafacilapp.bff.dto.monthlyincome.MonthlyIncomeDTO;
import com.contafacilapp.model.Client;
import com.contafacilapp.model.MonthlyIncome;

public class InsertMonthlyIncomeBFFRequestMapper {

    private MonthlyIncome requestBS = new MonthlyIncome();

    public InsertMonthlyIncomeBFFRequestMapper(MonthlyIncomeDTO monthlyIncomeDTO) {

        Client client = new Client();
        client.setId(Long.valueOf(monthlyIncomeDTO.getClientId()));
        requestBS.setClient(client);
        requestBS.setMonth(monthlyIncomeDTO.getMonth());
        requestBS.setYear(monthlyIncomeDTO.getYear());
        requestBS.setSalary(monthlyIncomeDTO.getSalary());
        requestBS.setTicket(monthlyIncomeDTO.getTicket());

    }

    public MonthlyIncome toBusinessDTO() {
        return requestBS;
    }
}
