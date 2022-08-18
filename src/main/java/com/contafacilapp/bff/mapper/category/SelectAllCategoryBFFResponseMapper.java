package com.contafacilapp.bff.mapper.category;

import com.contafacilapp.bff.dto.category.CategoryDTO;
import com.contafacilapp.bff.dto.category.SelectAllCategoryBFFResponseDTO;
import com.contafacilapp.model.Category;

import java.util.ArrayList;
import java.util.List;

public class SelectAllCategoryBFFResponseMapper {

    private SelectAllCategoryBFFResponseDTO responseBFF = new SelectAllCategoryBFFResponseDTO();

    public SelectAllCategoryBFFResponseMapper(List<Category> selectAllCategory) {

        List<CategoryDTO> content = new ArrayList<>();

        for(Category category : selectAllCategory) {

            CategoryDTO item = new CategoryDTO();
            item.setName(category.getName());
            item.setCategoryId(String.valueOf(category.getId()));
            content.add(item);

        }

        responseBFF.setContent(content);

    }

    public SelectAllCategoryBFFResponseDTO toFrontEndDTO() {
        return responseBFF;
    }
}
