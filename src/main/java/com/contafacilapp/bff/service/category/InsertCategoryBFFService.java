package com.contafacilapp.bff.service.category;

import com.contafacilapp.bff.dto.category.CategoryDTO;
import com.contafacilapp.bff.dto.category.InsertCategoryBFFResponseDTO;

public interface InsertCategoryBFFService {

    InsertCategoryBFFResponseDTO insertCategoryBFFService(CategoryDTO categoryDTO);

}
