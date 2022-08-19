package com.contafacilapp.bff.service.monthlyincome.impl;

import com.contafacilapp.bff.dto.monthlyincome.InsertMonthlyIncomeBFFResponseDTO;
import com.contafacilapp.bff.dto.monthlyincome.MonthlyIncomeDTO;
import com.contafacilapp.bff.mapper.monthlyincome.InsertMonthlyIncomeBFFRequestMapper;
import com.contafacilapp.bff.mapper.monthlyincome.InsertMonthlyIncomeBFFResponseMapper;
import com.contafacilapp.bff.service.monthlyincome.InsertMonthlyIncomeBFFService;
import com.contafacilapp.bs.MonthlyIncomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InsertMonthlyIncomeBFFServiceImpl implements InsertMonthlyIncomeBFFService {

    @Autowired
    private MonthlyIncomeService monthlyIncomeService;

    @Override
    public InsertMonthlyIncomeBFFResponseDTO insertMonthlyIncomeBFFService(MonthlyIncomeDTO monthlyIncomeDTO) {

        return new InsertMonthlyIncomeBFFResponseMapper(
                monthlyIncomeService.insertMonthlyIncome(
                        new InsertMonthlyIncomeBFFRequestMapper(monthlyIncomeDTO)
                                .toBusinessDTO())).toFrontEndDTO();
    }
}
