package com.contafacilapp.bff.dto.monthlyincome;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MonthlyIncomeDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String monthlyIncomeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String clientId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String salary;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String ticket;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String month;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String year;
}
