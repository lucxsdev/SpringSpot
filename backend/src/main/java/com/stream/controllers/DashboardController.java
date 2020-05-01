package com.stream.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.stream.domain.dto.DashboardDTO;
import com.stream.services.DashboardService;

@RestController
@RequestMapping(value="/dashboard")
public class DashboardController {
	
	@Autowired
	DashboardService dashboardService; 
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<DashboardDTO> dashboard(){
		
		DashboardDTO res = dashboardService.dashboard();
		
		return ResponseEntity.ok().body(res);
	}
	
	
}
