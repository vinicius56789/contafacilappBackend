package com.contafacilapp.bff.service.extraincome.impl;

import com.contafacilapp.bff.dto.extraincome.ExtraIncomeDTO;
import com.contafacilapp.bff.dto.extraincome.SelectAllExtraIncomeOfThisMonthBFFResponseDTO;
import com.contafacilapp.bff.mapper.extraincome.SelectAllExtraIncomeOfThisMonthBFFRequestMapper;
import com.contafacilapp.bff.mapper.extraincome.SelectAllExtraIncomeOfThisMonthBFFResponseMapper;
import com.contafacilapp.bff.service.extraincome.SelectAllExtraIncomeOfThisMonthBFFService;
import com.contafacilapp.bs.ExtraIncomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SelectAllExtraIncomeOfThisMonthBFFServiceImpl implements SelectAllExtraIncomeOfThisMonthBFFService {

    @Autowired
    private ExtraIncomeService extraIncomeService;

    @Override
    public SelectAllExtraIncomeOfThisMonthBFFResponseDTO selectAllExtraIncomeOfThisMonthBFFService(ExtraIncomeDTO extraIncomeDTO) {

        return new SelectAllExtraIncomeOfThisMonthBFFResponseMapper(
                extraIncomeService.selectAllExtraIncomeOfThisMonth(
                        new SelectAllExtraIncomeOfThisMonthBFFRequestMapper(extraIncomeDTO)
                                .toBusinessDTO())).toFrontEndDTO();
    }
}
