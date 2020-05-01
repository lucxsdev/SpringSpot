package com.stream.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.stream.domain.Artist;

@Repository
public interface ArtistRepository extends JpaRepository<Artist, Integer> {
	
	@Query(value="SELECT * FROM "
			+ "artist a INNER JOIN album ab "
			+ "ON a.id = ab.artist_id "
			+ "WHERE ab.category_id = :id GROUP BY a.id" , nativeQuery = true)
	List<Artist> findArtistByIdCategory(@Param("id") Integer id);
}
