package com.riigsoft.dynadropdown.repo;

import com.riigsoft.dynadropdown.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CountryRepository extends JpaRepository<Country, Integer> {

	
	@Query("SELECT c.id,c.name FROM Country c")
	List<Object[]> getAllCountries();
	
	@Query("SELECT s.id,s.name FROM Country c JOIN c.states AS s WHERE c.id=:id")
	List<Object[]> getStatesByCountry(Integer id);
}
