package com.stream.services;

import java.util.List;

import com.stream.domain.Categories;
import com.stream.domain.dto.CategoriesDTO;

public interface CategoriesService {
	
	 List<Categories> findAll();
	 
	 CategoriesDTO findById(Integer id);
}
