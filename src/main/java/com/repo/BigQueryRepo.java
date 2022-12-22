package com.repo;

import com.model.Category;
import com.repo.genericRepo.GenericRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
public interface BigQueryRepo extends GenericRepository<Category> {
}
