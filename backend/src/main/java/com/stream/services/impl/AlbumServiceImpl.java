package com.stream.services.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lojaweb.services.exceptions.ObjectNotfoundException;
import com.stream.domain.Album;
import com.stream.repositories.AlbumRepository;
import com.stream.services.AlbumService;

@Service
public class AlbumServiceImpl implements AlbumService{
	
	@Autowired
	private AlbumRepository albumRepository;
	
	@Override
	public Album findById(Integer id) {
		
		Optional<Album> data = albumRepository.findById(id);
		
		return data.orElseThrow(() -> new ObjectNotfoundException("O objeto " + id + " não foi encontrado"));
	}
}













