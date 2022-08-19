package com.contafacilapp.bff.service.monthlyincome.impl;

import com.contafacilapp.bff.dto.monthlyincome.MonthlyIncomeDTO;
import com.contafacilapp.bff.dto.monthlyincome.SelectCurrentMonthlyIncomeBFFResponseDTO;
import com.contafacilapp.bff.mapper.monthlyincome.SelectCurrentMonthlyIncomeBFFRequestMapper;
import com.contafacilapp.bff.mapper.monthlyincome.SelectCurrentMonthlyIncomeBFFResponseMapper;
import com.contafacilapp.bff.service.monthlyincome.SelectCurrentMonthlyIncomeBFFService;
import com.contafacilapp.bs.MonthlyIncomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SelectCurrentMonthlyIncomeBFFServiceImpl implements SelectCurrentMonthlyIncomeBFFService {

    @Autowired
    private MonthlyIncomeService monthlyIncomeService;

    @Override
    public SelectCurrentMonthlyIncomeBFFResponseDTO selectCurrentMonthlyIncomeBFFService(MonthlyIncomeDTO monthlyIncomeDTO) {

        return new SelectCurrentMonthlyIncomeBFFResponseMapper(
                monthlyIncomeService.selectCurrentMonthlyIncome(
                        new SelectCurrentMonthlyIncomeBFFRequestMapper(monthlyIncomeDTO)
                                .toBusinessDTO())).toFrontEndDTO();
    }
}
