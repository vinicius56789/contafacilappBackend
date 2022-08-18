package com.contafacilapp.bff.service.category.impl;

import com.contafacilapp.bff.dto.category.CategoryDTO;
import com.contafacilapp.bff.dto.category.InsertCategoryBFFResponseDTO;
import com.contafacilapp.bff.mapper.category.InsertCategoryBFFRequestMapper;
import com.contafacilapp.bff.mapper.category.InsertCategoryBFFResponseMapper;
import com.contafacilapp.bff.service.category.InsertCategoryBFFService;
import com.contafacilapp.bs.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InsertCategoryBFFServiceImpl implements InsertCategoryBFFService {

    @Autowired
    private CategoryService categoryService;

    @Override
    public InsertCategoryBFFResponseDTO insertCategoryBFFService(CategoryDTO categoryDTO) {

        return new InsertCategoryBFFResponseMapper(
                categoryService.insertCategory(
                        new InsertCategoryBFFRequestMapper(categoryDTO)
                                .toBusinessDTO())).toFrontEndDTO();
    }
}
