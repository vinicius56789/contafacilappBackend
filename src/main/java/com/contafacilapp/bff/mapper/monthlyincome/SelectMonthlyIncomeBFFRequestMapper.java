package com.contafacilapp.bff.mapper.monthlyincome;

import com.contafacilapp.bff.dto.monthlyincome.MonthlyIncomeDTO;
import com.contafacilapp.model.MonthlyIncome;

public class SelectMonthlyIncomeBFFRequestMapper {

    private MonthlyIncome requestBS = new MonthlyIncome();

    public SelectMonthlyIncomeBFFRequestMapper(MonthlyIncomeDTO monthlyIncomeDTO) {

        requestBS.setId(Long.valueOf(monthlyIncomeDTO.getMonthlyIncomeId()));

    }

    public MonthlyIncome toBusinessDTO() {
        return requestBS;
    }
}
