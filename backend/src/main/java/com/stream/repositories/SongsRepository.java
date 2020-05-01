package com.stream.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.stream.domain.Songs;

@Repository
public interface SongsRepository extends JpaRepository<Songs, Integer> {
	
	@Query(value="SELECT * "
				+ "FROM album a INNER JOIN songs s ON a.id = s.album_id "
				+ "WHERE a.category_id = :id" , nativeQuery = true)
	List<Songs> findSongByIdCategory(@Param("id") Integer id);

}
