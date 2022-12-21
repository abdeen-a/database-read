package com.example.redShift.dto;

import com.example.redShift.model.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryAdapter {

    public static Category getCategory(CategoryDTO categoryDTO) {
        Category category = new Category();
        if (categoryDTO != null) {
            category = new Category(categoryDTO.getCatid(),
                    categoryDTO.getCatgroup(),
                    categoryDTO.getCatdesc(),
                    categoryDTO.getCatname());
        }
        return category;
    }

    public static CategoryDTO getCategoryDTO(Category category) {
        CategoryDTO categoryDTO = new CategoryDTO();
        if (category != null) {
            categoryDTO = new CategoryDTO(category.getCatid(),
                    category.getCatgroup(),
                    category.getCatdesc(),
                    category.getCatname());
        }
        return categoryDTO;
    }

    public static List<CategoryDTO> getCategoryDtoList(List<Category> categories) {
        List<CategoryDTO> categoryDTOList = new ArrayList<CategoryDTO>();
        if (categories != null) {
            categories.forEach(c -> categoryDTOList.add(getCategoryDTO(c)));
        }
        return categoryDTOList;
    }
}
