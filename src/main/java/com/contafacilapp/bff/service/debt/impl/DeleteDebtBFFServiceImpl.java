package com.contafacilapp.bff.service.debt.impl;

import com.contafacilapp.bff.dto.debt.DebtDTO;
import com.contafacilapp.bff.dto.debt.DeleteDebtBFFResponseDTO;
import com.contafacilapp.bff.mapper.debt.DeleteDebtBFFRequestMapper;
import com.contafacilapp.bff.mapper.debt.DeleteDebtBFFResponseMapper;
import com.contafacilapp.bff.service.debt.DeleteDebtBFFService;
import com.contafacilapp.bs.DebtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteDebtBFFServiceImpl implements DeleteDebtBFFService {

    @Autowired
    private DebtService debtService;

    @Override
    public DeleteDebtBFFResponseDTO deleteDebtBFFService(DebtDTO debtDTO) {

        return new DeleteDebtBFFResponseMapper(
                debtService.deleteDebt(
                        new DeleteDebtBFFRequestMapper(debtDTO)
                                .toBusinessDTO())).toFrontEndDTO();
    }
}
