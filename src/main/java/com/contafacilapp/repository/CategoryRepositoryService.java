package com.contafacilapp.repository;

import com.contafacilapp.model.Category;

import java.util.List;

public interface CategoryRepositoryService {

    List<Category> selectAllCategory();

    Category selectCategory(Category category);

    int insertCategory(Category category);

    int deleteCategory(Category category);
}
