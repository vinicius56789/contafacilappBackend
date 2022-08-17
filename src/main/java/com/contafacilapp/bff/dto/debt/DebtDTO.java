package com.contafacilapp.bff.dto.debt;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DebtDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String debtId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String clientId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String monthlyInterest;

}
