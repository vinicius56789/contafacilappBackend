package com.contafacilapp.bff.service.debt.impl;

import com.contafacilapp.bff.dto.debt.DebtDTO;
import com.contafacilapp.bff.dto.debt.InsertDebtBFFResponseDTO;
import com.contafacilapp.bff.mapper.debt.InsertDebtBFFRequestMapper;
import com.contafacilapp.bff.mapper.debt.InsertDebtBFFResponseMapper;
import com.contafacilapp.bff.service.debt.InsertDebtBFFService;
import com.contafacilapp.bs.DebtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InsertDebtBFFServiceImpl implements InsertDebtBFFService {

    @Autowired
    private DebtService debtService;

    @Override
    public InsertDebtBFFResponseDTO insertDebtBFFService(DebtDTO debtDTO) {

        return new InsertDebtBFFResponseMapper(
                debtService.insertDebt(
                        new InsertDebtBFFRequestMapper(debtDTO)
                                .toBusinessDTO())).toFrontEndDTO();
    }
}
