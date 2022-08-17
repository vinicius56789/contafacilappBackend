package com.contafacilapp.bs;

import com.contafacilapp.model.Category;

import java.util.List;

public interface CategoryService {

    List<Category> selectAllCategory(Category category);

    Category selectCategory(Category category);

    int insertCategory(Category category);

    int deleteCategory(Category category);
}
