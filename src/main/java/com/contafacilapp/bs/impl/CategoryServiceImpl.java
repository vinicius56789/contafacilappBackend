package com.contafacilapp.bs.impl;

import com.contafacilapp.bs.CategoryService;
import com.contafacilapp.model.Category;
import com.contafacilapp.repository.CategoryRepositoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepositoryService gateway;

    @Override
    public List<Category> selectAllCategory() {
        return gateway.selectAllCategory();
    }

    @Override
    public Category selectCategory(Category category) {
        return gateway.selectCategory(category);
    }

    @Override
    public int insertCategory(Category category) {
        return gateway.insertCategory(category);
    }

    @Override
    public int deleteCategory(Category category) {
        return gateway.deleteCategory(category);
    }
}
