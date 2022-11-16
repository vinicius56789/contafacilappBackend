package com.contafacilapp.bff.service.impl.category;

import com.contafacilapp.bff.dto.category.CategoryDTO;
import com.contafacilapp.bff.service.category.impl.InsertCategoryBFFServiceImpl;
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
public class InsertCategoryBFFServiceImplTest {

    @Mock
    private CategoryService categoryService;

    @InjectMocks
    private InsertCategoryBFFServiceImpl service;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void insertCategoryBFFServiceSuccessTest() {

        CategoryDTO categoryDTO = new CategoryDTO();
        categoryDTO.setName("abc");

        Mockito.when(categoryService.insertCategory(Mockito.any())).thenReturn(1);

        Assertions.assertNotNull(service.insertCategoryBFFService(categoryDTO));
    }

    @Test
    void insertCategoryBFFServiceErrorTest() {

        CategoryDTO categoryDTO = new CategoryDTO();

        Mockito.when(categoryService.insertCategory(Mockito.any())).thenReturn(0);

        Assertions.assertNotNull(service.insertCategoryBFFService(categoryDTO));
    }
}
