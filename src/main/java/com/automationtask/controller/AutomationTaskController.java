package com.automationtask.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AutomationTaskController {
	@GetMapping(value="/getTheMessage")
	public String getThis() {
		return "Automation Task";
	}
}
