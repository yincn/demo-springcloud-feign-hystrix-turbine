package com.example.controller;

import com.example.service.DeptService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class UserController {

	@Autowired
	DeptService deptService;
	
	private Logger log = LoggerFactory.getLogger(UserController.class);

	@PostMapping("/dept/get/{id}")
	public String getDept(HttpServletRequest request, @PathVariable("id") Integer id) {
		log.info("getDept is call");
		String result = deptService.selectDept(id);
		return result;
	}
	
}
