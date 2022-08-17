package com.contafacilapp.bff.dto.monthlyincome;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SelectAllMonthlyIncomeBFFResponseDTO {

    private List<MonthlyIncomeDTO> content;

}
