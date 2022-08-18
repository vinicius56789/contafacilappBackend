package com.contafacilapp.bff.service.debt.impl;

import com.contafacilapp.bff.dto.debt.DebtDTO;
import com.contafacilapp.bff.dto.debt.UpdateDebtBFFResponseDTO;
import com.contafacilapp.bff.mapper.debt.UpdateDebtBFFRequestMapper;
import com.contafacilapp.bff.mapper.debt.UpdateDebtBFFResponseMapper;
import com.contafacilapp.bff.service.debt.UpdateDebtBFFService;
import com.contafacilapp.bs.DebtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateDebtBFFServiceImpl implements UpdateDebtBFFService {

    @Autowired
    private DebtService debtService;

    @Override
    public UpdateDebtBFFResponseDTO updateDebtBFFService(DebtDTO debtDTO) {

        return new UpdateDebtBFFResponseMapper(
                debtService.updateDebt(
                        new UpdateDebtBFFRequestMapper(debtDTO)
                                .toBusinessDTO())).toFrontEndDTO();
    }
}
