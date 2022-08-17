package com.contafacilapp.bff.dto.bill;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BillDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String categoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String clientId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String billId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String reminder;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String month;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String year;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String dueDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String paid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String paidMonth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Boolean constant;

}
