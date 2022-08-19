package com.contafacilapp.bff.service.monthlyincome.impl;

import com.contafacilapp.bff.dto.monthlyincome.MonthlyIncomeDTO;
import com.contafacilapp.bff.dto.monthlyincome.SelectMonthlyIncomeBFFResponseDTO;
import com.contafacilapp.bff.mapper.monthlyincome.SelectMonthlyIncomeBFFRequestMapper;
import com.contafacilapp.bff.mapper.monthlyincome.SelectMonthlyIncomeBFFResponseMapper;
import com.contafacilapp.bff.service.monthlyincome.SelectMonthlyIncomeBFFService;
import com.contafacilapp.bs.MonthlyIncomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SelectMonthlyIncomeBFFServiceImpl implements SelectMonthlyIncomeBFFService {

    @Autowired
    private MonthlyIncomeService monthlyIncomeService;

    @Override
    public SelectMonthlyIncomeBFFResponseDTO selectMonthlyIncomeBFFService(MonthlyIncomeDTO monthlyIncomeDTO) {

        return new SelectMonthlyIncomeBFFResponseMapper(
                monthlyIncomeService.selectMonthlyIncome(
                        new SelectMonthlyIncomeBFFRequestMapper(monthlyIncomeDTO)
                                .toBusinessDTO())).toFrontEndDTO();
    }
}
