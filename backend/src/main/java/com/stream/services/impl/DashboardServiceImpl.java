package com.stream.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stream.domain.Album;
import com.stream.domain.dto.DashboardDTO;
import com.stream.repositories.AlbumRepository;
import com.stream.services.DashboardService;

@Service
public class DashboardServiceImpl implements DashboardService {
	
	@Autowired
	private AlbumRepository albumRepository;
	
	@Override
    public List<Album> findRecentAlbums() {
		
		List<Album> res =  albumRepository.findRecentAlbums();
		
		List<Album> obj = new ArrayList<>();
		
		for( int i = 0; i < 4; i++) {
			
			obj.add(res.get(i));
		}
		
        return obj;
    }
	
	@Override
	public DashboardDTO dashboard() {
		
		DashboardDTO obj = new DashboardDTO();
		
		obj.setRecent_albums(findRecentAlbums());
		obj.setRecommend_albums(findRecentAlbums());
		
		return obj;
	}
}
