package com.contafacilapp.bs.impl;

import com.contafacilapp.bs.DebtService;
import com.contafacilapp.model.Debt;
import com.contafacilapp.repository.DebtRepositoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DebtServiceImpl implements DebtService {

    @Autowired
    private DebtRepositoryService gateway;

    @Override
    public List<Debt> selectAllDebts(Debt debt) {
        return gateway.selectAllDebts(debt);
    }

    @Override
    public Debt selectDebt(Debt debt) {
        return gateway.selectDebt(debt);
    }

    @Override
    public int insertDebt(Debt debt) {
        return gateway.insertDebt(debt);
    }

    @Override
    public int updateDebt(Debt debt) {
        return gateway.updateDebt(debt);
    }

    @Override
    public int deleteDebt(Debt debt) {
        return gateway.deleteDebt(debt);
    }
}
