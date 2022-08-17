package com.contafacilapp.bff.dto.bill;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SelectAllBillsBFFResponseDTO {

    private List<BillDTO> content;

}
