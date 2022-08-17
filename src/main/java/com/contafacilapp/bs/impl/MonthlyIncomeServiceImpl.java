package com.contafacilapp.bs.impl;

import com.contafacilapp.bs.MonthlyIncomeService;
import com.contafacilapp.model.MonthlyIncome;
import com.contafacilapp.repository.MonthlyIncomeRepositoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MonthlyIncomeServiceImpl implements MonthlyIncomeService {

    @Autowired
    private MonthlyIncomeRepositoryService gateway;

    @Override
    public List<MonthlyIncome> selectAllMonthlyIncome(MonthlyIncome monthlyIncome) {
        return gateway.selectAllMonthlyIncome(monthlyIncome);
    }

    @Override
    public MonthlyIncome selectMonthlyIncome(MonthlyIncome monthlyIncome) {
        return gateway.selectMonthlyIncome(monthlyIncome);
    }

    @Override
    public MonthlyIncome selectCurrentMonthlyIncome(MonthlyIncome monthlyIncome) {
        return gateway.selectCurrentMonthlyIncome(monthlyIncome);
    }

    @Override
    public int insertMonthlyIncome(MonthlyIncome monthlyIncome) {
        return gateway.insertMonthlyIncome(monthlyIncome);
    }

    @Override
    public int updateMonthlyIncome(MonthlyIncome monthlyIncome) {
        return gateway.updateMonthlyIncome(monthlyIncome);
    }
}
