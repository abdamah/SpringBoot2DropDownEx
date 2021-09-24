package com.riigsoft.dynadropdown.service.impl;

import com.riigsoft.dynadropdown.repo.CountryRepository;
import com.riigsoft.dynadropdown.service.CountryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryServiceImpl implements CountryService {
    private final CountryRepository countryRepository;

    public CountryServiceImpl(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @Override
    public List<Object[]> getAllCountries() {
        return countryRepository.getAllCountries();
    }

    @Override
    public List<Object[]> getStatesByCountry(Integer id) {
        return countryRepository.getStatesByCountry(id);
    }
}
