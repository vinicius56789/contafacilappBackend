package com.contafacilapp.bff.mapper.category;

import com.contafacilapp.bff.dto.category.CategoryDTO;
import com.contafacilapp.bff.dto.category.SelectCategoryBFFResponseDTO;
import com.contafacilapp.model.Category;

public class SelectCategoryBFFResponseMapper {

    private SelectCategoryBFFResponseDTO responseBFF = new SelectCategoryBFFResponseDTO();

    public SelectCategoryBFFResponseMapper(Category selectCategory) {

        CategoryDTO categoryDTO = new CategoryDTO();
        categoryDTO.setName(selectCategory.getName());

        responseBFF.setContent(categoryDTO);

    }

    public SelectCategoryBFFResponseDTO toFrontEndDTO() {
        return responseBFF;
    }
}
