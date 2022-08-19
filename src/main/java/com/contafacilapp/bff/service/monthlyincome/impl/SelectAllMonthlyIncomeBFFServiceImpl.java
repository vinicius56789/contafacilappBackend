package com.contafacilapp.bff.service.monthlyincome.impl;

import com.contafacilapp.bff.dto.monthlyincome.MonthlyIncomeDTO;
import com.contafacilapp.bff.dto.monthlyincome.SelectAllMonthlyIncomeBFFResponseDTO;
import com.contafacilapp.bff.mapper.monthlyincome.SelectAllMonthlyIncomeBFFRequestMapper;
import com.contafacilapp.bff.mapper.monthlyincome.SelectAllMonthlyIncomeBFFResponseMapper;
import com.contafacilapp.bff.service.monthlyincome.SelectAllMonthlyIncomeBFFService;
import com.contafacilapp.bs.MonthlyIncomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SelectAllMonthlyIncomeBFFServiceImpl implements SelectAllMonthlyIncomeBFFService {

    @Autowired
    private MonthlyIncomeService monthlyIncomeService;

    @Override
    public SelectAllMonthlyIncomeBFFResponseDTO selectAllMonthlyIncomeBFFService(MonthlyIncomeDTO monthlyIncomeDTO) {

        return new SelectAllMonthlyIncomeBFFResponseMapper(
                monthlyIncomeService.selectAllMonthlyIncome(
                        new SelectAllMonthlyIncomeBFFRequestMapper(monthlyIncomeDTO)
                                .toBusinessDTO())).toFrontEndDTO();
    }
}
