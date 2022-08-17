package com.contafacilapp.bff.service.category;

import com.contafacilapp.bff.dto.category.CategoryDTO;
import com.contafacilapp.bff.dto.category.SelectAllCategoryBFFResponseDTO;

public interface SelectAllCategoryBFFService {

    SelectAllCategoryBFFResponseDTO selectAllCategoryBFFService(CategoryDTO categoryDTO);
}
