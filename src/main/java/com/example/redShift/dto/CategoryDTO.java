package com.example.redShift.dto;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryDTO {
        private Integer catid;
        private String catgroup;
        private String catname;
        private String catdesc;
}
