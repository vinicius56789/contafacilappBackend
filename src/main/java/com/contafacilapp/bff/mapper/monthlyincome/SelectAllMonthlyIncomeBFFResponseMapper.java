package com.contafacilapp.bff.mapper.monthlyincome;

import com.contafacilapp.bff.dto.monthlyincome.MonthlyIncomeDTO;
import com.contafacilapp.bff.dto.monthlyincome.SelectAllMonthlyIncomeBFFResponseDTO;
import com.contafacilapp.model.MonthlyIncome;

import java.util.ArrayList;
import java.util.List;

public class SelectAllMonthlyIncomeBFFResponseMapper {

    private SelectAllMonthlyIncomeBFFResponseDTO responseBFF = new SelectAllMonthlyIncomeBFFResponseDTO();

    public SelectAllMonthlyIncomeBFFResponseMapper(List<MonthlyIncome> selectAllMonthlyIncome) {

        List<MonthlyIncomeDTO> content = new ArrayList<>();

        for (MonthlyIncome monthlyIncome : selectAllMonthlyIncome) {

            MonthlyIncomeDTO item = new MonthlyIncomeDTO();
            item.setMonthlyIncomeId(String.valueOf(monthlyIncome.getId()));
            item.setSalary(monthlyIncome.getSalary());
            item.setTicket(monthlyIncome.getTicket());
            item.setYear(monthlyIncome.getYear());
            item.setMonth(monthlyIncome.getMonth());
            content.add(item);

        }

        responseBFF.setContent(content);
    }

    public SelectAllMonthlyIncomeBFFResponseDTO toFrontEndDTO() {
        return responseBFF;
    }
}
