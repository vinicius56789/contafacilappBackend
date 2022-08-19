package com.contafacilapp.bff.mapper.monthlyincome;

import com.contafacilapp.bff.dto.monthlyincome.MonthlyIncomeDTO;
import com.contafacilapp.bff.dto.monthlyincome.SelectCurrentMonthlyIncomeBFFResponseDTO;
import com.contafacilapp.model.MonthlyIncome;

public class SelectCurrentMonthlyIncomeBFFResponseMapper {

    private SelectCurrentMonthlyIncomeBFFResponseDTO responseBFF = new SelectCurrentMonthlyIncomeBFFResponseDTO();

    public SelectCurrentMonthlyIncomeBFFResponseMapper(MonthlyIncome selectCurrentMonthlyIncome) {

        MonthlyIncomeDTO monthlyIncomeDTO = new MonthlyIncomeDTO();
        monthlyIncomeDTO.setMonthlyIncomeId(String.valueOf(selectCurrentMonthlyIncome.getId()));
        monthlyIncomeDTO.setMonth(selectCurrentMonthlyIncome.getMonth());
        monthlyIncomeDTO.setYear(selectCurrentMonthlyIncome.getYear());
        monthlyIncomeDTO.setTicket(selectCurrentMonthlyIncome.getTicket());
        monthlyIncomeDTO.setSalary(selectCurrentMonthlyIncome.getSalary());

        responseBFF.setContent(monthlyIncomeDTO);
    }

    public SelectCurrentMonthlyIncomeBFFResponseDTO toFrontEndDTO() {
        return responseBFF;
    }
}
