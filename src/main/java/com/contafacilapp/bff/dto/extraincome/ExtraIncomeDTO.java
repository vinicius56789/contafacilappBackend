package com.contafacilapp.bff.dto.extraincome;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExtraIncomeDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String extraIncomeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String clientId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String month;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String year;
}
