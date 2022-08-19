package com.contafacilapp.controller;

import com.contafacilapp.bff.dto.bill.*;
import com.contafacilapp.bff.service.bill.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bill")
public class BillController {

    @Autowired
    private DeleteBillBFFService deleteBillBFFService;

    @Autowired
    private InsertBillBFFService insertBillBFFService;

    @Autowired
    private SelectAllBillsBFFService selectAllBillsBFFService;

    @Autowired
    private SelectBillBFFService selectBillBFFService;

    @Autowired
    private UpdateBillBFFService updateBillBFFService;

    @PostMapping("/delete")
    public DeleteBillBFFResponseDTO deleteBill(@RequestBody BillDTO billDTO) {
        return deleteBillBFFService.deleteBillBFFService(billDTO);
    }

    @PostMapping("/insert")
    public InsertBillBFFResponseDTO insertBill(@RequestBody BillDTO billDTO) {
        return insertBillBFFService.insertBillBFFService(billDTO);
    }

    @PostMapping("/list")
    public SelectAllBillsBFFResponseDTO selectAllBills(@RequestBody BillDTO billDTO) {
        return selectAllBillsBFFService.selectAllBillsBFFService(billDTO);
    }

    @PostMapping("/details")
    public SelectBillBFFResponseDTO selectBill(@RequestBody BillDTO billDTO) {
        return selectBillBFFService.selectBillBFFService(billDTO);
    }

    @PostMapping("/update")
    public UpdateBillBFFResponseDTO updateBill(@RequestBody BillDTO billDTO) {
        return updateBillBFFService.updateBillBFFService(billDTO);
    }

}
