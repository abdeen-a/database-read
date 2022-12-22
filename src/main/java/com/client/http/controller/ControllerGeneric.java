package com.client.http.controller;

import com.model.baseEntity.BaseEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

public interface ControllerGeneric<T extends BaseEntity>  {

    ResponseEntity<Object> save(@RequestBody T entity);

    ResponseEntity<T> findAll() ;

    ResponseEntity<T> findById(@PathVariable Integer id);

    ResponseEntity<String> delete(@PathVariable Integer id);

}
