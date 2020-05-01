package com.stream.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stream.domain.Categories;

@Repository
public interface CategoriesRepository extends JpaRepository<Categories, Integer> {
	
	
	
}
