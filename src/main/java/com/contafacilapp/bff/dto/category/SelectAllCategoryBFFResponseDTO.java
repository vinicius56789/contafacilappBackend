package com.contafacilapp.bff.dto.category;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SelectAllCategoryBFFResponseDTO {

    private List<CategoryDTO> content;

}
