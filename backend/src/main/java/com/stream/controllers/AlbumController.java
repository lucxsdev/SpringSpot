package com.stream.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.stream.domain.Album;
import com.stream.services.AlbumService;

@RestController
@RequestMapping(value = "/albums")
public class AlbumController {
	
	@Autowired
	AlbumService albumService;
	
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> findbyId(@PathVariable Integer id){
		
		Album res = albumService.findById(id);

		return ResponseEntity.ok().body(res);
	}

}
