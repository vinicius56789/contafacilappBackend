package com.contafacilapp.bff.dto.category;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CategoryDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String categoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String name;
}
