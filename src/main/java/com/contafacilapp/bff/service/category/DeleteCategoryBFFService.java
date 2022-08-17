package com.contafacilapp.bff.service.category;

import com.contafacilapp.bff.dto.category.CategoryDTO;
import com.contafacilapp.bff.dto.category.DeleteCategoryBFFResponseDTO;

public interface DeleteCategoryBFFService {

    DeleteCategoryBFFResponseDTO deleteCategoryBFFService(CategoryDTO categoryDTO);
}
