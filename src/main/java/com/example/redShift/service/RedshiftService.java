package com.example.redShift.service;

import com.example.redShift.dto.CategoryAdapter;
import com.example.redShift.dto.CategoryDTO;
import com.example.redShift.model.Category;
import com.example.redShift.repo.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RedshiftService {

    public List<CategoryDTO> getALlCategories();


}