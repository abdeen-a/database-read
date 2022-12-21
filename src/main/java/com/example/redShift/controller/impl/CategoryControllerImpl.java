package com.example.redShift.controller.impl;

import com.example.redShift.dto.CategoryDTO;
import com.example.redShift.service.CategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class CategoryControllerImpl {

    @Autowired
    private CategoryService categoryServiceImpl;

    @GetMapping("category/{categoryId}")
    public ResponseEntity<?> getCategory(@PathVariable Integer categoryId) {
        log.info("getting category for {} ", categoryId);
        CategoryDTO result = categoryServiceImpl.getCategory(categoryId);
        log.info("category back {} ", result.toString());
        return new ResponseEntity<CategoryDTO>(result, HttpStatus.OK);
    }

    @GetMapping("/category")
    public ResponseEntity<?> getAllCategories() {
        log.info("Getting all categories");
        List<CategoryDTO> result = categoryServiceImpl.getALlCategories();
        log.info("Data back {} ", result.toString());
        return new ResponseEntity<List<CategoryDTO>>(result, HttpStatus.OK);
    }
}
