package com.contafacilapp.bs.impl;

import com.contafacilapp.model.Category;
import com.contafacilapp.repository.CategoryRepositoryService;
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
public class CategoryServiceImplTest {

    @Mock
    private CategoryRepositoryService gateway;

    @InjectMocks
    private CategoryServiceImpl service;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void selectAllCategoryTest() {

        List<Category> categories = new ArrayList<>();

        Mockito.when(gateway.selectAllCategory()).thenReturn(categories);

        Assertions.assertNotNull(service.selectAllCategory());
    }

    @Test
    void selectCategoryTest() {

        Category category = new Category();

        Mockito.when(gateway.selectCategory(Mockito.any())).thenReturn(category);

        Assertions.assertNotNull(service.selectCategory(category));
    }

    @Test
    void insertCategoryTest() {

        Category category = new Category();

        Mockito.when(gateway.insertCategory(Mockito.any())).thenReturn(1);

        Assertions.assertNotNull(service.insertCategory(category));
    }

    @Test
    void deleteCategoryTest() {

        Category category = new Category();

        Mockito.when(gateway.deleteCategory(Mockito.any())).thenReturn(1);

        Assertions.assertNotNull(service.deleteCategory(category));
    }
}
