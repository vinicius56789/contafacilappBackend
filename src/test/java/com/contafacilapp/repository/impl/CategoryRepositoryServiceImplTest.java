package com.contafacilapp.repository.impl;

import com.contafacilapp.model.Category;
import org.hibernate.query.Query;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class CategoryRepositoryServiceImplTest {

    @Mock
    private EntityManager entityManager;

    @InjectMocks
    private CategoryRepositoryServiceImpl gateway;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void selectAllCategoryTest() {

        List<Category> categories = new ArrayList<>();

        Query query = Mockito.mock(Query.class);

        Mockito.when(entityManager.createQuery(Mockito.any(), Mockito.any())).thenReturn(query);
        Mockito.when(query.getResultList()).thenReturn(categories);

        Assertions.assertNotNull(gateway.selectAllCategory());
    }

    @Test
    void selectCategoryTest() {

        Category category = new Category();
        category.setId(1L);

        Query query = Mockito.mock(Query.class);

        Mockito.when(entityManager.createQuery(Mockito.any(), Mockito.any())).thenReturn(query);
        Mockito.when(query.setParameter("id", category.getId())).thenReturn(query);
        Mockito.when(query.getSingleResult()).thenReturn(category);

        Assertions.assertNotNull(gateway.selectCategory(category));
    }

    @Test
    void insertCategoryTest() {

        Category category = new Category();
        category.setId(1L);
        category.setName("categoria");

        Assertions.assertNotNull(gateway.insertCategory(category));
    }

    @Test
    void deleteCategoryTest() {

        Category category = new Category();
        category.setId(1L);

        Query query = Mockito.mock(Query.class);

        Mockito.when(entityManager.createQuery("delete from category where id = :id")).thenReturn(query);
        Mockito.when(query.setParameter("id", category.getId())).thenReturn(query);
        Mockito.when(query.executeUpdate()).thenReturn(1);

        gateway.deleteCategory(category);
    }
}
