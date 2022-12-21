package com.example.redShift.service;

import com.example.redShift.dto.CategoryDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CategoryService {

    public List<CategoryDTO> getALlCategories();
    public CategoryDTO getCategory(Integer categoryId);


}