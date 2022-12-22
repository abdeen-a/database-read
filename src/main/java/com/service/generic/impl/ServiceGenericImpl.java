package com.service.generic.impl;

import com.model.baseEntity.BaseEntity;
import com.repo.genericRepo.GenericRepository;
import com.service.generic.ServiceGeneric;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


public class ServiceGenericImpl<T extends BaseEntity> implements ServiceGeneric<T> {

   @Autowired
   protected GenericRepository<T> genericRepository;

   @Override
   public List<T> findAll() throws Exception {
      try {
         return genericRepository.findAll();
      } catch (Exception e) {
         throw e;
      }
   }

   @Override
   public T findById(Integer id) throws Exception {
      return genericRepository.findById(id).orElseThrow();
   }

   @Override
   public T save(T entity) throws Exception {
      try {
         return genericRepository.save(entity);
      } catch (Exception e) {
         throw e;
      }
   }

   @Override
   public void delete(Integer id) throws Exception {
      try {
         genericRepository.deleteById(id);
      } catch (Exception e) {
         throw e;
      }
   }
}