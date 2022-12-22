package com.service.generic;

import com.model.baseEntity.BaseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ServiceGeneric<T extends BaseEntity>  {
//
//    public List<CategoryDTO> getALlCategories();
//    public CategoryDTO getCategory(Integer categoryId);

    List<T> findAll() throws Exception;

    T findById(Integer id) throws Exception;
    T save(T entity) throws Exception;
    void delete(Integer id) throws Exception;


}