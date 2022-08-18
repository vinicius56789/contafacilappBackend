package com.contafacilapp.bff.service.category.impl;

import com.contafacilapp.bff.dto.category.CategoryDTO;
import com.contafacilapp.bff.dto.category.SelectAllCategoryBFFResponseDTO;
import com.contafacilapp.bff.mapper.category.SelectAllCategoryBFFResponseMapper;
import com.contafacilapp.bff.service.category.SelectAllCategoryBFFService;
import com.contafacilapp.bs.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SelectAllCategoryBFFServiceImpl implements SelectAllCategoryBFFService {

    @Autowired
    private CategoryService categoryService;

    @Override
    public SelectAllCategoryBFFResponseDTO selectAllCategoryBFFService(CategoryDTO categoryDTO) {

        return new SelectAllCategoryBFFResponseMapper(
                categoryService.selectAllCategory()).toFrontEndDTO();
    }
}
