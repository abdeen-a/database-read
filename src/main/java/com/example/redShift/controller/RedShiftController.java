package com.example.redShift.controller;

import com.example.redShift.dto.CategoryDTO;
import com.example.redShift.exception.CustomErrorType;
import com.example.redShift.service.impl.RedshiftServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public interface RedShiftController  {

    @GetMapping("/redshift/{param}")
    public ResponseEntity<?> getData(@PathVariable String param) ;


}
