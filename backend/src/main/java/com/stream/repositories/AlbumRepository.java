package com.stream.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.stream.domain.Album;

@Repository
public interface AlbumRepository extends JpaRepository<Album, Integer> {
	
	@Query("SELECT a FROM Album a")
	public List<Album> findRecentAlbums();
	
	@Query(value="SELECT * FROM album WHERE category_id = :id" , nativeQuery = true)
	List<Album> findAlbumByIdCategory(@Param("id") Integer id);
	
	// SELECT s.file_url, s.title, s.id FROM album a INNER JOIN songs s ON a.id = s.album_id WHERE a.category_id = 1



}
