package com.contafacilapp.bff.service.category;

import com.contafacilapp.bff.dto.category.CategoryDTO;
import com.contafacilapp.bff.dto.category.SelectCategoryBFFResponseDTO;

public interface SelectCategoryBFFService {

    SelectCategoryBFFResponseDTO selectCategoryBFFService(CategoryDTO categoryDTO);

}
