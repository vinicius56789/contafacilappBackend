package com.contafacilapp.bs.impl;

import com.contafacilapp.bs.ExtraIncomeService;
import com.contafacilapp.model.ExtraIncome;
import com.contafacilapp.repository.ExtraIncomeRepositoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExtraIncomeServiceImpl implements ExtraIncomeService {

    @Autowired
    private ExtraIncomeRepositoryService gateway;

    @Override
    public List<ExtraIncome> selectAllExtraIncome(ExtraIncome extraIncome) {
        return gateway.selectAllExtraIncome(extraIncome);
    }

    @Override
    public ExtraIncome selectExtraIncome(ExtraIncome extraIncome) {
        return gateway.selectExtraIncome(extraIncome);
    }

    @Override
    public List<ExtraIncome> selectAllExtraIncomeOfThisMonth(ExtraIncome extraIncome) {
        return gateway.selectAllExtraIncomeOfThisMonth(extraIncome);
    }

    @Override
    public int insertExtraIncome(ExtraIncome extraIncome) {
        return gateway.insertExtraIncome(extraIncome);
    }

    @Override
    public int updateExtraIncome(ExtraIncome extraIncome) {
        return gateway.updateExtraIncome(extraIncome);
    }

    @Override
    public int deleteExtraIncome(ExtraIncome extraIncome) {
        return gateway.deleteExtraIncome(extraIncome);
    }
}
