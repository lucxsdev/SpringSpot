package com.stream.domain.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.stream.domain.Album;

public class DashboardDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private List<Album> recent_albums = new ArrayList<>();
	private List<Album> recommend_albums = new ArrayList<>();
	
	public DashboardDTO() {
		
	}

	public List<Album> getRecent_albums() {
		return recent_albums;
	}

	public void setRecent_albums(List<Album> recent_albums) {
		this.recent_albums = recent_albums;
	}

	public List<Album> getRecommend_albums() {
		return recommend_albums;
	}

	public void setRecommend_albums(List<Album> recommend_albums) {
		this.recommend_albums = recommend_albums;
	}
	
}
