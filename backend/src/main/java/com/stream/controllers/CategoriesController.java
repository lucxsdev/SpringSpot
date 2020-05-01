package com.stream.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.stream.domain.Categories;
import com.stream.domain.dto.CategoriesDTO;
import com.stream.services.CategoriesService;

@RestController
@RequestMapping(value = "/categories")
public class CategoriesController {
	
	@Autowired
	CategoriesService categoriesService;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<Map<String, Object>> findAll(){
		
		List<Categories> res = categoriesService.findAll();
		
		Map<String, Object> map = new HashMap<>();
		
		map.put("categories", res);
		
		return ResponseEntity.ok().body(map);
	}
	
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> findbyId(@PathVariable Integer id){
		
		CategoriesDTO res = categoriesService.findById(id);

		return ResponseEntity.ok().body(res);
	}

}
