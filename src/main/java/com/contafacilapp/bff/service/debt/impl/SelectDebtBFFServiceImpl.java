package com.contafacilapp.bff.service.debt.impl;

import com.contafacilapp.bff.dto.debt.DebtDTO;
import com.contafacilapp.bff.dto.debt.SelectDebtBFFResponseDTO;
import com.contafacilapp.bff.mapper.debt.SelectDebtBFFRequestMapper;
import com.contafacilapp.bff.mapper.debt.SelectDebtBFFResponseMapper;
import com.contafacilapp.bff.service.debt.SelectDebtBFFService;
import com.contafacilapp.bs.DebtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SelectDebtBFFServiceImpl implements SelectDebtBFFService {

    @Autowired
    private DebtService debtService;

    @Override
    public SelectDebtBFFResponseDTO selectDebtBFFService(DebtDTO debtDTO) {

        return new SelectDebtBFFResponseMapper(
                debtService.selectDebt(
                        new SelectDebtBFFRequestMapper(debtDTO)
                                .toBusinessDTO())).toFrontEndDTO();
    }
}
