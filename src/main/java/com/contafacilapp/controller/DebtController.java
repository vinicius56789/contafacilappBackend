package com.contafacilapp.controller;

import com.contafacilapp.bff.dto.debt.*;
import com.contafacilapp.bff.service.debt.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/debt")
public class DebtController {

    @Autowired
    private DeleteDebtBFFService deleteDebtBFFService;

    @Autowired
    private InsertDebtBFFService insertDebtBFFService;

    @Autowired
    private SelectAllDebtsBFFService selectAllDebtsBFFService;

    @Autowired
    private SelectDebtBFFService selectDebtBFFService;

    @Autowired
    private UpdateDebtBFFService updateDebtBFFService;

    @PostMapping("/delete")
    public DeleteDebtBFFResponseDTO deleteDebt(@RequestBody DebtDTO debtDTO) {
        return deleteDebtBFFService.deleteDebtBFFService(debtDTO);
    }

    @PostMapping("/insert")
    public InsertDebtBFFResponseDTO insertDebt(@RequestBody DebtDTO debtDTO) {
        return insertDebtBFFService.insertDebtBFFService(debtDTO);
    }

    @PostMapping("/list")
    public SelectAllDebtsBFFResponseDTO selectAllDebts(@RequestBody DebtDTO debtDTO) {
        return selectAllDebtsBFFService.selectAllDebtsBFFService(debtDTO);
    }

    @PostMapping("/details")
    public SelectDebtBFFResponseDTO selectDebt(@RequestBody DebtDTO debtDTO) {
        return selectDebtBFFService.selectDebtBFFService(debtDTO);
    }

    @PostMapping("/update")
    public UpdateDebtBFFResponseDTO updateDebt(@RequestBody DebtDTO debtDTO) {
        return updateDebtBFFService.updateDebtBFFService(debtDTO);
    }
}
