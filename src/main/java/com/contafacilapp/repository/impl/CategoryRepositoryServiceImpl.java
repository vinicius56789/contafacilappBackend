package com.contafacilapp.repository.impl;

import com.contafacilapp.model.Category;
import com.contafacilapp.repository.CategoryRepositoryService;
import com.contafacilapp.util.ConstantsIntegerUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Service
public class CategoryRepositoryServiceImpl implements CategoryRepositoryService {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Category> selectAllCategory() {

        String query = "select c from category c";

        return entityManager.createQuery(query, Category.class)
                .getResultList();
    }

    @Override
    public Category selectCategory(Category category) {

        String query = "select c from category c where c.id = :id";

        return entityManager.createQuery(query, Category.class)
                .setParameter("id", category.getId())
                .getSingleResult();
    }

    @Override
    @Modifying
    @Transactional
    public int insertCategory(Category category) {

        try {

            entityManager.persist(category);

            return ConstantsIntegerUtils.ONE;

        } catch (Exception e) {
            return ConstantsIntegerUtils.ZERO;
        }
    }

    @Override
    @Modifying
    @Transactional
    public int deleteCategory(Category category) {

        String query = "delete from category where id = :id";

        return entityManager.createQuery(query)
                .setParameter("id", category.getId())
                .executeUpdate();
    }
}
