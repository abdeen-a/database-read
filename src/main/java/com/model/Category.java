package com.model;


import com.model.baseEntity.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table(name = "category")
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Category extends BaseEntity {

    //private Integer catid;
    private String catgroup;
    private String catname;
    private String catdesc;
}
