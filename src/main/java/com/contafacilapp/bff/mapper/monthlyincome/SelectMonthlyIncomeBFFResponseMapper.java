package com.contafacilapp.bff.mapper.monthlyincome;

import com.contafacilapp.bff.dto.monthlyincome.MonthlyIncomeDTO;
import com.contafacilapp.bff.dto.monthlyincome.SelectMonthlyIncomeBFFResponseDTO;
import com.contafacilapp.model.MonthlyIncome;

public class SelectMonthlyIncomeBFFResponseMapper {

    private SelectMonthlyIncomeBFFResponseDTO responseBFF = new SelectMonthlyIncomeBFFResponseDTO();

    public SelectMonthlyIncomeBFFResponseMapper(MonthlyIncome selectMonthlyIncome) {

        MonthlyIncomeDTO content = new MonthlyIncomeDTO();
        content.setSalary(selectMonthlyIncome.getSalary());
        content.setTicket(selectMonthlyIncome.getTicket());
        content.setMonth(selectMonthlyIncome.getMonth());
        content.setYear(selectMonthlyIncome.getYear());

        responseBFF.setContent(content);
    }

    public SelectMonthlyIncomeBFFResponseDTO toFrontEndDTO() {
        return responseBFF;
    }
}
