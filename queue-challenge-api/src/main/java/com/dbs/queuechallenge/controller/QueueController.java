package com.dbs.queuechallenge.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QueueController {
	
	@RequestMapping("/test")
	public String testApp() {
		return "you are in controller";
	}
}
