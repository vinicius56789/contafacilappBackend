package com.contafacilapp.bff.dto.debt;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SelectAllDebtsBFFResponseDTO {

    private List<DebtDTO> content;

}
