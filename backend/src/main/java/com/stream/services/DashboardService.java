package com.stream.services;

import java.util.List;

import com.stream.domain.Album;
import com.stream.domain.dto.DashboardDTO;

public interface DashboardService {
	
	List<Album> findRecentAlbums();
	
	DashboardDTO dashboard();
	
}
