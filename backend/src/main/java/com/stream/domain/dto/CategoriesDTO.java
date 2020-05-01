package com.stream.domain.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.stream.domain.Album;
import com.stream.domain.Artist;
import com.stream.domain.Songs;

public class CategoriesDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String name;
	private String image_url;
	
	private List<Songs> songs = new ArrayList<>();
	private List<Artist> artists = new ArrayList<>();
	private List<Album> albums = new ArrayList<>();
	
	public CategoriesDTO() {
		
	}

	public CategoriesDTO(String name, String image_url) {
		super();
		this.name = name;
		this.image_url = image_url;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImage_url() {
		return image_url;
	}

	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}

	public List<Songs> getSongs() {
		return songs;
	}

	public void setSongs(List<Songs> songs) {
		this.songs = songs;
	}

	public List<Artist> getArtists() {
		return artists;
	}

	public void setArtists(List<Artist> artists) {
		this.artists = artists;
	}

	public List<Album> getAlbums() {
		return albums;
	}

	public void setAlbums(List<Album> albums) {
		this.albums = albums;
	}

}
