package com.contafacilapp.bff.mapper.category;

import com.contafacilapp.bff.dto.category.CategoryDTO;
import com.contafacilapp.model.Category;

public class SelectCategoryBFFRequestMapper {

    private Category requestBS = new Category();

    public SelectCategoryBFFRequestMapper(CategoryDTO categoryDTO) {

        requestBS.setId(Long.valueOf(categoryDTO.getCategoryId()));
    }

    public Category toBusinessDTO() {
        return requestBS;
    }
}
