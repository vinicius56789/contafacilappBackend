package com.contafacilapp.bff.mapper.category;

import com.contafacilapp.bff.dto.category.CategoryDTO;
import com.contafacilapp.model.Category;

public class InsertCategoryBFFRequestMapper {

    private Category requestBS = new Category();

    public InsertCategoryBFFRequestMapper(CategoryDTO categoryDTO) {

        requestBS.setName(categoryDTO.getName());

    }

    public Category toBusinessDTO() {
        return requestBS;
    }
}
