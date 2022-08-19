package com.contafacilapp.bff.service.monthlyincome.impl;

import com.contafacilapp.bff.dto.monthlyincome.MonthlyIncomeDTO;
import com.contafacilapp.bff.dto.monthlyincome.UpdateMonthlyIncomeBFFResponseDTO;
import com.contafacilapp.bff.mapper.monthlyincome.UpdateMonthlyIncomeBFFRequestMapper;
import com.contafacilapp.bff.mapper.monthlyincome.UpdateMonthlyIncomeBFFResponseMapper;
import com.contafacilapp.bff.service.monthlyincome.UpdateMonthlyIncomeBFFService;
import com.contafacilapp.bs.MonthlyIncomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateMonthlyIncomeBFFServiceImpl implements UpdateMonthlyIncomeBFFService {

    @Autowired
    private MonthlyIncomeService monthlyIncomeService;

    @Override
    public UpdateMonthlyIncomeBFFResponseDTO updateMonthlyIncomeBFFService(MonthlyIncomeDTO monthlyIncomeDTO) {

        return new UpdateMonthlyIncomeBFFResponseMapper(
                monthlyIncomeService.updateMonthlyIncome(
                        new UpdateMonthlyIncomeBFFRequestMapper(monthlyIncomeDTO)
                                .toBusinessDTO())).toFrontEndDTO();
    }
}
