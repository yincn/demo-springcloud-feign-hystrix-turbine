package com.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class DeptController {
	
	private Logger logger = LoggerFactory.getLogger(DeptController.class);

	@PostMapping("/dept/{id}")
	public String getDept(HttpServletRequest request, @PathVariable("id") Integer id) {
		logger.info("getDept is call, id:{}", id);
		return "your id:" + id;
	}
	
}
