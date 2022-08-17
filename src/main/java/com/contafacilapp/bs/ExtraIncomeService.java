package com.contafacilapp.bs;

import com.contafacilapp.model.ExtraIncome;

import java.util.List;

public interface ExtraIncomeService {

    List<ExtraIncome> selectAllExtraIncome(ExtraIncome extraIncome);

    ExtraIncome selectExtraIncome(ExtraIncome extraIncome);

    List<ExtraIncome> selectAllExtraIncomeOfThisMonth(ExtraIncome extraIncome);

    int insertExtraIncome(ExtraIncome extraIncome);

    int updateExtraIncome(ExtraIncome extraIncome);

    int deleteExtraIncome(ExtraIncome extraIncome);
}
