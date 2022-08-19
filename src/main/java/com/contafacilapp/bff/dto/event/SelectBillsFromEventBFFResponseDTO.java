package com.contafacilapp.bff.dto.event;

import com.contafacilapp.bff.dto.bill.BillDTO;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SelectBillsFromEventBFFResponseDTO {

    private List<BillDTO> content;

}
