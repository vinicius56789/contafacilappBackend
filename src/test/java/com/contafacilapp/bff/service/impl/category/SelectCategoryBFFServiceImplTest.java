package com.contafacilapp.bff.service.impl.category;

import com.contafacilapp.bff.dto.category.CategoryDTO;
import com.contafacilapp.bff.service.category.impl.SelectAllCategoryBFFServiceImpl;
import com.contafacilapp.bff.service.category.impl.SelectCategoryBFFServiceImpl;
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

@ExtendWith(MockitoExtension.class)
public class SelectCategoryBFFServiceImplTest {

    @Mock
    private CategoryService categoryService;

    @InjectMocks
    private SelectCategoryBFFServiceImpl service;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void SelectCategoryBFFServiceImplTest() {

        CategoryDTO categoryDTO = new CategoryDTO();
        categoryDTO.setCategoryId("1");

        Category category = new Category();

        Mockito.when(categoryService.selectCategory(Mockito.any())).thenReturn(category);

        Assertions.assertNotNull(service.selectCategoryBFFService(categoryDTO));
    }
}
