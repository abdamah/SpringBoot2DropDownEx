package com.riigsoft.dynadropdown.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.riigsoft.dynadropdown.service.CountryService;
import com.riigsoft.dynadropdown.service.StateService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class DynaDropDownController {

	private final CountryService countryService;

	private final StateService stateService;

	public DynaDropDownController(CountryService countryService, StateService stateService) {
		this.countryService = countryService;
		this.stateService = stateService;
	}

	@GetMapping
	public String showRegister(Model model) {
		model.addAttribute("countryList", countryService.getAllCountries());
		return "Register";
	}
	
	@GetMapping("/getStates")
	public @ResponseBody String getStates(@RequestParam Integer countryId)
	{
		String json = null;
		List<Object[]> list = countryService.getStatesByCountry(countryId);
		try {
			json = new ObjectMapper().writeValueAsString(list);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return json;
	}
	
	@GetMapping("/getCities")
	public @ResponseBody String getCities(@RequestParam Integer stateId)
	{
		String json = null;
		List<Object[]> list = stateService.getCitiesByState(stateId);
		try {
			json = new ObjectMapper().writeValueAsString(list);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return json;
	}
	
}
