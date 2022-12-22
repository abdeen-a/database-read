package com.repo.genericRepo;

import com.model.baseEntity.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenericRepository<T extends BaseEntity> extends JpaRepository<T, Integer> {

}