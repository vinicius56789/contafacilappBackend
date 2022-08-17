package com.contafacilapp.repository;

import com.contafacilapp.model.ExtraIncome;

import java.util.List;

public interface ExtraIncomeRepositoryService {

    List<ExtraIncome> selectAllExtraIncome(ExtraIncome extraIncome);

    ExtraIncome selectExtraIncome(ExtraIncome extraIncome);

    List<ExtraIncome> selectAllExtraIncomeOfThisMonth(ExtraIncome extraIncome);

    int insertExtraIncome(ExtraIncome extraIncome);

    int updateExtraIncome(ExtraIncome extraIncome);

    int deleteExtraIncome(ExtraIncome extraIncome);

}
