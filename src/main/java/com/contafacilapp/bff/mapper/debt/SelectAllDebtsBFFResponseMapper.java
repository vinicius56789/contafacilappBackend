package com.contafacilapp.bff.mapper.debt;

import com.contafacilapp.bff.dto.debt.DebtDTO;
import com.contafacilapp.bff.dto.debt.SelectAllDebtsBFFResponseDTO;
import com.contafacilapp.model.Debt;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SelectAllDebtsBFFResponseMapper {

    private SelectAllDebtsBFFResponseDTO responseBFF = new SelectAllDebtsBFFResponseDTO();

    public SelectAllDebtsBFFResponseMapper(List<Debt> selectAllDebts) {

        List<DebtDTO> content = new ArrayList<>();

        for(Debt debt : selectAllDebts) {

            DebtDTO item = new DebtDTO();
            item.setDebtId(String.valueOf(debt.getId()));
            item.setMonthlyInterest(debt.getMonthlyInterest());
            item.setValue(debt.getValue());
            content.add(item);

        }

        responseBFF.setContent(content);

    }

    public SelectAllDebtsBFFResponseDTO toFrontEndDTO() {
        return responseBFF;
    }
}
