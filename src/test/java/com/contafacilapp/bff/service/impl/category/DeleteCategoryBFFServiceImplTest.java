package com.contafacilapp.bff.service.impl.category;

import com.contafacilapp.bff.dto.category.CategoryDTO;
import com.contafacilapp.bff.service.category.impl.DeleteCategoryBFFServiceImpl;
import com.contafacilapp.bs.CategoryService;
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
public class DeleteCategoryBFFServiceImplTest {

    @Mock
    private CategoryService categoryService;

    @InjectMocks
    private DeleteCategoryBFFServiceImpl service;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void deleteCategoryBFFServiceSuccessTest() {

        CategoryDTO categoryDTO = new CategoryDTO();
        categoryDTO.setCategoryId("1");

        Mockito.when(categoryService.deleteCategory(Mockito.any())).thenReturn(1);

        Assertions.assertNotNull(service.deleteCategoryBFFService(categoryDTO));
    }

    @Test
    void deleteCategoryBFFServiceErrorTest() {

        CategoryDTO categoryDTO = new CategoryDTO();
        categoryDTO.setCategoryId("1");

        Mockito.when(categoryService.deleteCategory(Mockito.any())).thenReturn(0);

        Assertions.assertNotNull(service.deleteCategoryBFFService(categoryDTO));
    }
}
