package com.contafacilapp.controller;

import com.contafacilapp.bff.dto.category.*;
import com.contafacilapp.bff.service.category.DeleteCategoryBFFService;
import com.contafacilapp.bff.service.category.InsertCategoryBFFService;
import com.contafacilapp.bff.service.category.SelectAllCategoryBFFService;
import com.contafacilapp.bff.service.category.SelectCategoryBFFService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private DeleteCategoryBFFService deleteCategoryBFFService;

    @Autowired
    private InsertCategoryBFFService insertCategoryBFFService;

    @Autowired
    private SelectAllCategoryBFFService selectAllCategoryBFFService;

    @Autowired
    private SelectCategoryBFFService selectCategoryBFFService;

    @PostMapping("/delete")
    public DeleteCategoryBFFResponseDTO deleteCategory(@RequestBody CategoryDTO categoryDTO) {
        return deleteCategoryBFFService.deleteCategoryBFFService(categoryDTO);
    }

    @PostMapping("/insert")
    public InsertCategoryBFFResponseDTO insertCategory(@RequestBody CategoryDTO categoryDTO) {
        return insertCategoryBFFService.insertCategoryBFFService(categoryDTO);
    }

    @PostMapping("/list")
    public SelectAllCategoryBFFResponseDTO selectAllCategory(@RequestBody CategoryDTO categoryDTO) {
        return selectAllCategoryBFFService.selectAllCategoryBFFService(categoryDTO);
    }

    @PostMapping("/details")
    public SelectCategoryBFFResponseDTO selectCategory(@RequestBody CategoryDTO categoryDTO) {
        return selectCategoryBFFService.selectCategoryBFFService(categoryDTO);
    }

}
