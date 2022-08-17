package com.contafacilapp.bs;

import com.contafacilapp.model.MonthlyIncome;

import java.util.List;

public interface MonthlyIncomeService {

    List<MonthlyIncome> selectAllMonthlyIncome(MonthlyIncome monthlyIncome);

    MonthlyIncome selectMonthlyIncome(MonthlyIncome monthlyIncome);

    MonthlyIncome selectCurrentMonthlyIncome(MonthlyIncome monthlyIncome);

    int insertMonthlyIncome(MonthlyIncome monthlyIncome);

    int updateMonthlyIncome(MonthlyIncome monthlyIncome);
}
