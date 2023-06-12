package com.vaishnavi.search.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vaishnavi.search.entity.City;
import com.vaishnavi.search.service.SearchService;

@RestController
@RequestMapping("/search")
public class Controller {
	
	@Autowired
	private SearchService s1;
	
	@GetMapping("/cities")
	public List<City> getCities() {
		return s1.getCities();
	}
	

}
