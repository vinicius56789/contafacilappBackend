package com.contafacilapp.bff.mapper.monthlyincome;

import com.contafacilapp.bff.dto.monthlyincome.MonthlyIncomeDTO;
import com.contafacilapp.model.MonthlyIncome;

public class UpdateMonthlyIncomeBFFRequestMapper {

    private MonthlyIncome requestBS = new MonthlyIncome();

    public UpdateMonthlyIncomeBFFRequestMapper(MonthlyIncomeDTO monthlyIncomeDTO) {

        requestBS.setId(Long.valueOf(monthlyIncomeDTO.getMonthlyIncomeId()));
        requestBS.setTicket(monthlyIncomeDTO.getTicket());
        requestBS.setSalary(monthlyIncomeDTO.getSalary());

    }

    public MonthlyIncome toBusinessDTO() {
        return requestBS;
    }
}
