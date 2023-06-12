package com.vaishnavi.fms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vaishnavi.fms.entity.City;
import com.vaishnavi.fms.proxy.Proxy;

@RestController
public class Controller {

	@Autowired
	private Proxy search;

	@GetMapping("cities")
	public List<City> getCities() {
		return search.getCities();

	}

}
