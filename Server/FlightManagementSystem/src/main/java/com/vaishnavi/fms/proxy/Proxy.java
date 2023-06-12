package com.vaishnavi.fms.proxy;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.vaishnavi.fms.entity.City;

@FeignClient(name = "search", url = "localhost:8100")
public interface Proxy {

	@GetMapping("/search/cities")
	public List<City> getCities();

}
