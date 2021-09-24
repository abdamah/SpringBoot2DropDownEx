package com.riigsoft.dynadropdown.service.impl;

import com.riigsoft.dynadropdown.repo.StateRepository;
import com.riigsoft.dynadropdown.service.StateService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StateServiceImpl implements StateService {

    private final StateRepository stateRepository;

    public StateServiceImpl(StateRepository stateRepository) {
        this.stateRepository = stateRepository;
    }

    @Override
    public List<Object[]> getCitiesByState(Integer id) {
        return stateRepository.getCitiesByState(id);
    }
}
