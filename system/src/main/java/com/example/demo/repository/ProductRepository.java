package com.example.demo.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	Page<Product> findByProductNameContainingAndLargeCategoryIdAndMediumCategoryIdAndSmallCategoryId(
			String productName, Long largeCategoryId, Long mediumCategoryId, Long smallCategoryId, Pageable pageable);
}
