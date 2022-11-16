package com.contafacilapp.bff.service.impl.category;

import com.contafacilapp.bff.dto.category.CategoryDTO;
import com.contafacilapp.bff.service.category.impl.SelectAllCategoryBFFServiceImpl;
import com.contafacilapp.bs.CategoryService;
import com.contafacilapp.model.Category;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class SelectAllCategoryBFFServiceImplTest {

    @Mock
    private CategoryService categoryService;

    @InjectMocks
    private SelectAllCategoryBFFServiceImpl service;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void selectAllCategoryBFFServiceTest() {

        CategoryDTO categoryDTO = new CategoryDTO();

        List<Category> categories = new ArrayList<>();
        Category category = new Category();
        category.setId(1L);
        categories.add(category);

        Mockito.when(categoryService.selectAllCategory()).thenReturn(categories);

        Assertions.assertNotNull(service.selectAllCategoryBFFService(categoryDTO));
    }
}
