package com.contafacilapp.repository;

import com.contafacilapp.model.Debt;

import java.util.List;

public interface DebtRepositoryService {

    List<Debt> selectAllDebts(Debt debt);

    Debt selectDebt(Debt debt);

    int insertDebt(Debt debt);

    int updateDebt(Debt debt);

    int deleteDebt(Debt debt);

}
