package com.brandroom.shopfirstproject.repository;

import com.brandroom.shopfirstproject.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Integer> {
}
