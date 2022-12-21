package com.example.redShift.service.impl;

import com.example.redShift.dto.CategoryAdapter;
import com.example.redShift.dto.CategoryDTO;
import com.example.redShift.model.Category;
import com.example.redShift.repo.CategoryRepo;
import com.example.redShift.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
   @Autowired
   private CategoryRepo categoryRepo;
   public List<CategoryDTO> getALlCategories(){
      List<Category> result = categoryRepo.findAll();
      return CategoryAdapter.getCategoryDtoList(result);
   }


}