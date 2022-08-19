package com.contafacilapp.bff.dto.event;

import com.contafacilapp.bff.dto.bill.BillDTO;
import com.contafacilapp.model.Bill;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;
import java.util.Set;

@Getter
@Setter
public class EventDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String eventId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String clientId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Set<BillDTO> bills;

}
