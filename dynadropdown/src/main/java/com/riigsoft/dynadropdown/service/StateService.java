package com.riigsoft.dynadropdown.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StateService {
	List<Object[]> getCitiesByState(Integer id);
}
