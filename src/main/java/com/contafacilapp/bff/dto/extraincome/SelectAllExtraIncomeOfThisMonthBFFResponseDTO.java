package com.contafacilapp.bff.dto.extraincome;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SelectAllExtraIncomeOfThisMonthBFFResponseDTO {

    private List<ExtraIncomeDTO> content;

}
