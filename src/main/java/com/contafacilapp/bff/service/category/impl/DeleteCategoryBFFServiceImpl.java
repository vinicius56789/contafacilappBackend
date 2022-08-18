package com.contafacilapp.bff.service.category.impl;

import com.contafacilapp.bff.dto.category.CategoryDTO;
import com.contafacilapp.bff.dto.category.DeleteCategoryBFFResponseDTO;
import com.contafacilapp.bff.mapper.category.DeleteCategoryBFFRequestMapper;
import com.contafacilapp.bff.mapper.category.DeleteCategoryBFFResponseMapper;
import com.contafacilapp.bff.service.category.DeleteCategoryBFFService;
import com.contafacilapp.bs.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteCategoryBFFServiceImpl implements DeleteCategoryBFFService {

    @Autowired
    private CategoryService categoryService;

    @Override
    public DeleteCategoryBFFResponseDTO deleteCategoryBFFService(CategoryDTO categoryDTO) {

        return new DeleteCategoryBFFResponseMapper(
                categoryService.deleteCategory(
                        new DeleteCategoryBFFRequestMapper(categoryDTO)
                                .toBusinessDTO())).toFrontEndDTO();
    }
}
