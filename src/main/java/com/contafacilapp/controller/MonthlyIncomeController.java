package com.contafacilapp.controller;

import com.contafacilapp.bff.dto.monthlyincome.*;
import com.contafacilapp.bff.service.monthlyincome.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/monthlyIncome")
public class MonthlyIncomeController {

    @Autowired
    private InsertMonthlyIncomeBFFService insertMonthlyIncomeBFFService;

    @Autowired
    private SelectAllMonthlyIncomeBFFService selectAllMonthlyIncomeBFFService;

    @Autowired
    private SelectCurrentMonthlyIncomeBFFService selectCurrentMonthlyIncomeBFFService;

    @Autowired
    private SelectMonthlyIncomeBFFService selectMonthlyIncomeBFFService;

    @Autowired
    private UpdateMonthlyIncomeBFFService updateMonthlyIncomeBFFService;

    @PostMapping("/insert")
    public InsertMonthlyIncomeBFFResponseDTO insertMonthlyIncome(@RequestBody MonthlyIncomeDTO monthlyIncomeDTO) {
        return insertMonthlyIncomeBFFService.insertMonthlyIncomeBFFService(monthlyIncomeDTO);
    }

    @PostMapping("/list")
    public SelectAllMonthlyIncomeBFFResponseDTO selectAllMonthlyIncome(@RequestBody MonthlyIncomeDTO monthlyIncomeDTO) {
        return selectAllMonthlyIncomeBFFService.selectAllMonthlyIncomeBFFService(monthlyIncomeDTO);
    }

    @PostMapping("/current_month")
    public SelectCurrentMonthlyIncomeBFFResponseDTO selectCurrentMonthlyIncome(@RequestBody MonthlyIncomeDTO monthlyIncomeDTO) {
        return selectCurrentMonthlyIncomeBFFService.selectCurrentMonthlyIncomeBFFService(monthlyIncomeDTO);
    }

    @PostMapping("/details")
    public SelectMonthlyIncomeBFFResponseDTO selectMonthlyIncome(@RequestBody MonthlyIncomeDTO monthlyIncomeDTO) {
        return selectMonthlyIncomeBFFService.selectMonthlyIncomeBFFService(monthlyIncomeDTO);
    }

    @PostMapping("/update")
    public UpdateMonthlyIncomeBFFResponseDTO updateMonthlyIncome(@RequestBody MonthlyIncomeDTO monthlyIncomeDTO) {
        return updateMonthlyIncomeBFFService.updateMonthlyIncomeBFFService(monthlyIncomeDTO);
    }
}
