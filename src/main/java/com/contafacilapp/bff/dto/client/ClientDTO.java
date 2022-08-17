package com.contafacilapp.bff.dto.client;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClientDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String clientId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String email;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String age;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String occupation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String password;

}
