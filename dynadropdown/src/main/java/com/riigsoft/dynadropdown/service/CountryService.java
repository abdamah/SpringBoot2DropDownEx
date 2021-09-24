package com.riigsoft.dynadropdown.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CountryService {


	List<Object[]> getAllCountries();

	List<Object[]>getStatesByCountry(Integer id);
}
