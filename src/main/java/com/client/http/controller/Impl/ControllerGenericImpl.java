package com.client.http.controller.Impl;

import com.client.http.controller.ControllerGeneric;
import com.model.baseEntity.BaseEntity;
import com.service.generic.ServiceGeneric;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@Slf4j
@RestController
public class ControllerGenericImpl<T extends BaseEntity> implements ControllerGeneric<T> {
    @Autowired
    private ServiceGeneric<T> genericService;

    @Override
    @PostMapping
    public ResponseEntity<Object> save(T entity) {
        try {
            return new ResponseEntity(genericService.save(entity),HttpStatus.OK);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    @GetMapping("/all")
    public ResponseEntity<T> findAll()  {
        try {
            return new ResponseEntity(genericService.findAll(), HttpStatus.OK);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<T> findById(Integer id) {
        try {
            return new ResponseEntity(genericService.findById(id), HttpStatus.OK);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") Integer id)  {

        try {
            genericService.delete(id);
            return new ResponseEntity("Record Deleted", HttpStatus.OK);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }

//    @Autowired
//    private ServiceGeneric serviceGenericImpl;
//
//    @GetMapping("category/{categoryId}")
//    public ResponseEntity<?> getCategory(@PathVariable Integer categoryId) {
//        log.info("getting category for {} ", categoryId);
//        CategoryDTO result = serviceGenericImpl.getCategory(categoryId);
//        log.info("category back {} ", result.toString());
//        return new ResponseEntity<CategoryDTO>(result, HttpStatus.OK);
//    }
//
//    @GetMapping("/category")
//    public ResponseEntity<?> getAllCategories() {
//        log.info("Getting all categories");
//        List<CategoryDTO> result = serviceGenericImpl.getALlCategories();
//        log.info("Data back {} ", result.toString());
//        return new ResponseEntity<List<CategoryDTO>>(result, HttpStatus.OK);
//    }
}
