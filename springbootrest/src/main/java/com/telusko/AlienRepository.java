package com.telusko;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface AlienRepository extends CrudRepository<Alien, Integer>
{

	List<Alien> findAll();

}
