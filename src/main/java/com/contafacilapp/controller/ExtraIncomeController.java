package com.contafacilapp.controller;

import com.contafacilapp.bff.dto.extraincome.*;
import com.contafacilapp.bff.service.extraincome.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/extraIncome")
public class ExtraIncomeController {

    @Autowired
    private DeleteExtraIncomeBFFService deleteExtraIncomeBFFService;

    @Autowired
    private InsertExtraIncomeBFFService insertExtraIncomeBFFService;

    @Autowired
    private SelectAllExtraIncomeBFFService selectAllExtraIncomeBFFService;

    @Autowired
    private SelectAllExtraIncomeOfThisMonthBFFService selectAllExtraIncomeOfThisMonthBFFService;

    @Autowired
    private SelectExtraIncomeBFFService selectExtraIncomeBFFService;

    @Autowired
    private UpdateExtraIncomeBFFService updateExtraIncomeBFFService;

    @PostMapping("/delete")
    public DeleteExtraIncomeBFFResponseDTO deleteExtraIncome(@RequestBody ExtraIncomeDTO extraIncomeDTO) {
        return deleteExtraIncomeBFFService.deleteExtraIncomeBFFService(extraIncomeDTO);
    }

    @PostMapping("/insert")
    public InsertExtraIncomeBFFResponseDTO insertExtraIncome(@RequestBody ExtraIncomeDTO extraIncomeDTO) {
        return insertExtraIncomeBFFService.insertExtraIncomeBFFService(extraIncomeDTO);
    }

    @PostMapping("/list")
    public SelectAllExtraIncomeBFFResponseDTO selectAllExtraIncome(@RequestBody ExtraIncomeDTO extraIncomeDTO) {
        return selectAllExtraIncomeBFFService.selectAllExtraIncomeBFFService(extraIncomeDTO);
    }

    @PostMapping("/month_list")
    public SelectAllExtraIncomeOfThisMonthBFFResponseDTO selectAllExtraIncomeOfThisMonth(@RequestBody ExtraIncomeDTO extraIncomeDTO) {
        return selectAllExtraIncomeOfThisMonthBFFService.selectAllExtraIncomeOfThisMonthBFFService(extraIncomeDTO);
    }

    @PostMapping("/details")
    public SelectExtraIncomeBFFResponseDTO selectExtraIncome(@RequestBody ExtraIncomeDTO extraIncomeDTO) {
        return selectExtraIncomeBFFService.selectExtraIncomeBFFService(extraIncomeDTO);
    }

    @PostMapping("/update")
    public UpdateExtraIncomeBFFResponseDTO updateExtraIncome(@RequestBody ExtraIncomeDTO extraIncomeDTO) {
        return updateExtraIncomeBFFService.updateExtraIncomeBFFService(extraIncomeDTO);
    }

}
