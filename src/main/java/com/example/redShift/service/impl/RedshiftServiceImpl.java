package com.example.redShift.service.impl;

import com.example.redShift.dto.CategoryAdapter;
import com.example.redShift.dto.CategoryDTO;
import com.example.redShift.model.Category;
import com.example.redShift.repo.CategoryRepo;
import com.example.redShift.service.RedshiftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RedshiftServiceImpl implements RedshiftService {
   @Autowired
   private CategoryRepo categoryRepo;

//  private final JdbcTemplate jdbcTemplate;
//   @Autowired
//   public RedshiftService(JdbcTemplate jdbcTemplate) {
//      this.jdbcTemplate = jdbcTemplate;
//   }

   public List<CategoryDTO> getALlCategories(){
      List<Category> result = categoryRepo.findAll();
      return CategoryAdapter.getAccountDTOList(result);
   }


}