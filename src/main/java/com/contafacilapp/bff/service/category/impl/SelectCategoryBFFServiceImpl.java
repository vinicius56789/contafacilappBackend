package com.contafacilapp.bff.service.category.impl;

import com.contafacilapp.bff.dto.category.CategoryDTO;
import com.contafacilapp.bff.dto.category.SelectCategoryBFFResponseDTO;
import com.contafacilapp.bff.mapper.category.SelectCategoryBFFRequestMapper;
import com.contafacilapp.bff.mapper.category.SelectCategoryBFFResponseMapper;
import com.contafacilapp.bff.service.category.SelectCategoryBFFService;
import com.contafacilapp.bs.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SelectCategoryBFFServiceImpl implements SelectCategoryBFFService {

    @Autowired
    private CategoryService categoryService;

    @Override
    public SelectCategoryBFFResponseDTO selectCategoryBFFService(CategoryDTO categoryDTO) {

        return new SelectCategoryBFFResponseMapper(
                categoryService.selectCategory(
                        new SelectCategoryBFFRequestMapper(categoryDTO)
                                .toBusinessDTO())).toFrontEndDTO();
    }
}
