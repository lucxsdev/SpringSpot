package com.stream.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stream.domain.Album;
import com.stream.domain.Artist;
import com.stream.domain.Categories;
import com.stream.domain.Songs;
import com.stream.domain.dto.CategoriesDTO;
import com.stream.repositories.AlbumRepository;
import com.stream.repositories.ArtistRepository;
import com.stream.repositories.CategoriesRepository;
import com.stream.repositories.SongsRepository;
import com.stream.services.CategoriesService;

@Service
public class CategoriesServiceImpl implements CategoriesService{
	
	@Autowired
	private CategoriesRepository categoriesRepository;
	
	@Autowired
	private AlbumRepository albumRepository;
	
	@Autowired
	private SongsRepository songsRepository;
	
	@Autowired
	private ArtistRepository artistRepository;
	
	@Override
	public List<Categories> findAll() {
		
		return categoriesRepository.findAll();
	}
	
	@Override
	public CategoriesDTO findById(Integer id) {
		
		final Optional<Categories> cat = categoriesRepository.findById(id);
		
		CategoriesDTO response = new CategoriesDTO();
		
		response.setName(cat.get().getName());
		response.setImage_url(cat.get().getImage_url());
		
		final List<Album> album = albumRepository.findAlbumByIdCategory(id);
		
		response.setAlbums(album);
		
		final List<Songs> songs = songsRepository.findSongByIdCategory(id);
		
		response.setSongs(songs);
		
		final List<Artist> artists = artistRepository.findArtistByIdCategory(id);
		
		response.setArtists(artists);
		
		return response;
	}
}













