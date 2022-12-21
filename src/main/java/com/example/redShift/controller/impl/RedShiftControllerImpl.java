package com.example.redShift.controller.impl;

import com.example.redShift.controller.RedShiftController;
import com.example.redShift.dto.CategoryDTO;
import com.example.redShift.service.RedshiftService;
import com.example.redShift.service.impl.RedshiftServiceImpl;
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
public class RedShiftControllerImpl implements RedShiftController {

    @Autowired
    private RedshiftService redshiftServiceImpl;


    @GetMapping("/redshift/{param}")
    public ResponseEntity<?> getData(@PathVariable String param) {
        log.info("getData for {} ", param);
        List<CategoryDTO> result = redshiftServiceImpl.getALlCategories();
        log.info("Data back {} ", result.toString());
        return new ResponseEntity<List<CategoryDTO>>(result, HttpStatus.OK);
    }


}
