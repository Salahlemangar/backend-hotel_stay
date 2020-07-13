package org.sid.dao;

import java.util.List;


import org.sid.entities.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;


@RepositoryRestResource
@CrossOrigin("*")

public interface HotelRepository extends JpaRepository<Hotel, Long> {

	public List<Hotel> findAll();
	@Query("select h from Hotel h where h.name like :x")
	public List<Hotel>findByNameContains(@Param("x")String mc);

}
