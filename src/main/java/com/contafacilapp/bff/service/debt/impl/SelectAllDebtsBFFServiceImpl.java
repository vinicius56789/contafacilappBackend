package com.contafacilapp.bff.service.debt.impl;

import com.contafacilapp.bff.dto.debt.DebtDTO;
import com.contafacilapp.bff.dto.debt.SelectAllDebtsBFFResponseDTO;
import com.contafacilapp.bff.mapper.debt.SelectAllDebtsBFFRequestMapper;
import com.contafacilapp.bff.mapper.debt.SelectAllDebtsBFFResponseMapper;
import com.contafacilapp.bff.service.debt.SelectAllDebtsBFFService;
import com.contafacilapp.bs.DebtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SelectAllDebtsBFFServiceImpl implements SelectAllDebtsBFFService {

    @Autowired
    private DebtService debtService;

    @Override
    public SelectAllDebtsBFFResponseDTO selectAllDebtsBFFService(DebtDTO debtDTO) {

        return new SelectAllDebtsBFFResponseMapper(
                debtService.selectAllDebts(
                        new SelectAllDebtsBFFRequestMapper(debtDTO)
                                .toBusinessDTO())).toFrontEndDTO();
    }
}
