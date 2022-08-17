package com.contafacilapp.repository;

import com.contafacilapp.model.MonthlyIncome;

import java.util.List;

public interface MonthlyIncomeRepositoryService {

    List<MonthlyIncome> selectAllMonthlyIncome(MonthlyIncome monthlyIncome);

    MonthlyIncome selectMonthlyIncome(MonthlyIncome monthlyIncome);

    MonthlyIncome selectCurrentMonthlyIncome(MonthlyIncome monthlyIncome);

    int insertMonthlyIncome(MonthlyIncome monthlyIncome);

    int updateMonthlyIncome(MonthlyIncome monthlyIncome);

}
