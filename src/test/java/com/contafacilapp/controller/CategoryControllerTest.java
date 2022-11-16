package com.contafacilapp.controller;

import com.contafacilapp.bff.dto.category.*;
import com.contafacilapp.bff.service.category.DeleteCategoryBFFService;
import com.contafacilapp.bff.service.category.InsertCategoryBFFService;
import com.contafacilapp.bff.service.category.SelectAllCategoryBFFService;
import com.contafacilapp.bff.service.category.SelectCategoryBFFService;
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
public class CategoryControllerTest {

    @Mock
    private DeleteCategoryBFFService deleteCategoryBFFService;

    @Mock
    private InsertCategoryBFFService insertCategoryBFFService;

    @Mock
    private SelectAllCategoryBFFService selectAllCategoryBFFService;

    @Mock
    private SelectCategoryBFFService selectCategoryBFFService;

    @InjectMocks
    private CategoryController controller;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void deleteCategoryTest() {

        CategoryDTO categoryDTO = new CategoryDTO();

        DeleteCategoryBFFResponseDTO deleteCategoryBFFResponseDTO = new DeleteCategoryBFFResponseDTO();

        Mockito.when(deleteCategoryBFFService.deleteCategoryBFFService(Mockito.any())).thenReturn(deleteCategoryBFFResponseDTO);

        Assertions.assertNotNull(controller.deleteCategory(categoryDTO));
    }

    @Test
    void insertCategoryTest() {

        CategoryDTO categoryDTO = new CategoryDTO();

        InsertCategoryBFFResponseDTO deleteCategoryBFFResponseDTO = new InsertCategoryBFFResponseDTO();

        Mockito.when(insertCategoryBFFService.insertCategoryBFFService(Mockito.any())).thenReturn(deleteCategoryBFFResponseDTO);

        Assertions.assertNotNull(controller.insertCategory(categoryDTO));
    }

    @Test
    void selectAllCategoryTest() {

        CategoryDTO categoryDTO = new CategoryDTO();

        SelectAllCategoryBFFResponseDTO SelectAllCategoryBFFResponseDTO = new SelectAllCategoryBFFResponseDTO();

        Mockito.when(selectAllCategoryBFFService.selectAllCategoryBFFService(Mockito.any())).thenReturn(SelectAllCategoryBFFResponseDTO);

        Assertions.assertNotNull(controller.selectAllCategory(categoryDTO));
    }

    @Test
    void selectCategoryTest() {

        CategoryDTO categoryDTO = new CategoryDTO();

        SelectCategoryBFFResponseDTO deleteCategoryBFFResponseDTO = new SelectCategoryBFFResponseDTO();

        Mockito.when(selectCategoryBFFService.selectCategoryBFFService(Mockito.any())).thenReturn(deleteCategoryBFFResponseDTO);

        Assertions.assertNotNull(controller.selectCategory(categoryDTO));
    }

}
