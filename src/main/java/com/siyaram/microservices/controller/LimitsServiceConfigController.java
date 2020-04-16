package com.siyaram.microservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.siyaram.microservices.dto.Configuration;
import com.siyaram.microservices.dto.LimitConfigBean;

@RestController
public class LimitsServiceConfigController {
	
	@Autowired
	private Configuration config;
	@GetMapping("/limits")
	public LimitConfigBean getLimits() {
		return new LimitConfigBean(1000,1);
	}
	@GetMapping("/configServer/limits")
	public LimitConfigBean getConfigServerLimits() {
		return new LimitConfigBean(config.getMaximum(),config.getMinimum());
	}
}
